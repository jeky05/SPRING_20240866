package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Value;

@Controller

public class FileController {

    @Autowired

    @Value("${spring.servlet.multipart.location}") // properties 등록된 설정(경로) 주입
    private String uploadFolder;

    @PostMapping("/upload-email")
    public String uploadEmail(
            @RequestParam("email") String email,
            @RequestParam("subject") String subject,
            @RequestParam("message") String message,
            @RequestParam("name") String name,
            RedirectAttributes redirectAttributes) {
        try {
            Path uploadPath = Paths.get(uploadFolder).toAbsolutePath();
            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
            }

            String sanitizedEmail = email.replaceAll("[^a-zA-Z0-9]", "_"); // 언더바로 구분하는 정규식(@랑 . 을 _로)
            Path filePath = uploadPath.resolve(sanitizedEmail + ".txt");

            // 저장할 내용
            String content = "이름: " + name + System.lineSeparator()
                    + "메일 제목: " + subject + System.lineSeparator()
                    + "요청 메시지:" + System.lineSeparator()
                    + message;

            if (Files.exists(filePath)) { // 파일이 이미 존재하는 경우
                String existingContent = Files.readString(filePath); // 기존 파일 내용 읽기

                if (!existingContent.equals(content)) { // 내용이 다르면 새 파일 생성
                    int counter = 1;
                    Path duplicatePath;
                    do {
                        String numberedName = sanitizedEmail + "(" + counter + ").txt";
                        duplicatePath = uploadPath.resolve(numberedName);
                        counter++;
                    } while (Files.exists(duplicatePath));
                    filePath = duplicatePath;
                } else {
                    // 내용이 동일하면 업로드 중단 및 오류 페이지로 리다이렉트
                    redirectAttributes.addFlashAttribute("message", "이미 동일한 내용의 파일이 존재합니다!");
                    return "redirect:/error_page/fileupload_error";
                }
            }

            System.out.println("File path: " + filePath);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath.toFile()))) {
                writer.write(content);
            }
            redirectAttributes.addFlashAttribute("message", "메일 내용이 성공적으로 업로드 되었습니다!");
        } catch (IOException e) {
            e.printStackTrace();
            redirectAttributes.addFlashAttribute("message", "업로드 중 오류가 발생했습니다.");
            return "/error_page/article_error";
        }
        return "upload_end"; // .html 파일 연동
    }

    @GetMapping("/error_page/fileupload_error")
    public String fileUploadErrorPage() {
        return "error_page/fileupload_error";
    }

}
