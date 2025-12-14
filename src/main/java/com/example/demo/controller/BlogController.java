package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
import com.example.demo.model.service.BlogService;
import java.util.Optional;
import com.example.demo.model.service.AddArticleRequest;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.model.domain.Board;
import org.springframework.data.domain.*;
import jakarta.servlet.http.HttpSession;

@Controller
@Service
@Repository

@ControllerAdvice

public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("/about_detailed")
    public String about() {
        return "about_detailed";
    }

    @GetMapping("/board_list") // 게시글 목록 페이지 이동
    public String board_list(
            Model model, @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "") String keyword, HttpSession session) {
        PageRequest pageable = PageRequest.of(page, 3);
        Page<Board> list;

        String userId = (String) session.getAttribute("userId");
        String email = (String) session.getAttribute("email");

        if (userId == null) {
            return "redirect:/member_login";
        }
        System.out.println("세션 userId: " + userId);

        int startNum = (page * 3) + 1;
        model.addAttribute("startNum", startNum);
        model.addAttribute("email", email);

        if (keyword.isEmpty()) {
            list = blogService.findAll(pageable); // 기본셋
        } else {
            list = blogService.searchByKeyword(keyword, pageable);
        }
        model.addAttribute("boards", list); // 기본셋
        model.addAttribute("totalPages", list.getTotalPages());
        model.addAttribute("currentPage", page);
        model.addAttribute("keyword", keyword);

        return "board_list";

    }

    @GetMapping("/session-expired")
    public String session_expired() {
        return "/error_page/session_expired";
    }

    @GetMapping("/board_view/{id}") // 게시글 상세보기 페이지 이동 (내용볼수있는곳)
    public String board_view(Model model, @PathVariable Long id, HttpSession session) {
        Optional<Board> list = blogService.findById(id);
        String email = (String) session.getAttribute("email");
        if (list.isPresent()) {
            model.addAttribute("board", list.get());
            model.addAttribute("email", email);
        } else {
            return "/error_page/article_error";
        }
        return "board_view";
    }

    @GetMapping("/board_write") // 게시글 작성 페이지 이동
    public String board_write(HttpSession session, Model model) {
        String email = (String) session.getAttribute("email");
        model.addAttribute("email", email); // 모델에 email 추가
        return "board_write";
    }

    @GetMapping("/board_edit/{id}") // 게시글 수정 페이지 이동
    public String board_edit(Model model, @PathVariable Long id) {
        Optional<Board> list = blogService.findById(id);

        if (list.isPresent()) {
            model.addAttribute("board", list.get());
        } else {
            return "/error_page/article_error";
        }
        return "board_edit";
    }

    @DeleteMapping("/api/board_delete/{id}") // 게시글 삭제 후 리다이렉트
    public String deleteBoard(@PathVariable Long id) {
        blogService.delete(id);
        return "redirect:/board_list";
    }

    @PutMapping("/api/board_edit/{id}") // 게시글 수정 후 리다이렉트
    public String updateBoardEdit(@PathVariable Long id, @ModelAttribute AddArticleRequest request) {
        blogService.update(id, request);
        return "redirect:/board_list";
    }

    @PostMapping("/api/boards") // 게시글 추가 후 리다이렉트
    public String addBoard(@ModelAttribute AddArticleRequest request, HttpSession session) {
        String email = (String) session.getAttribute("email");
        if (email == null) {
            return "redirect:/member_login"; // 로그인 안 되어 있으면 로그인 페이지로
        }
        // DTO에 세션 email을 주입
        request.setUserEmail(email);

        blogService.save(request);
        return "redirect:/board_list";
    }

    @ExceptionHandler(NumberFormatException.class)
    public String handleNumberFormatException() {
        return "/error_page/article_idError";
    }

}
