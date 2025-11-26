package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.example.demo.model.service.Member_Service;

import jakarta.validation.Valid;

import com.example.demo.model.service.AddMemberRequest;
import com.example.demo.model.domain.Member;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.*;
import java.util.UUID;

@Repository
@Controller
@Service
public class MemberController {

    @Autowired
    Member_Service memberService;

    @GetMapping("/join_new") // 회원가입 페이지
    public String join_new() {
        return "join_new";
    }

    @PostMapping("/api/members") // 회원가입 처리
    public String addmembers(@Valid @ModelAttribute AddMemberRequest request) {
        memberService.saveMember(request);
        return "join_end";
    }

    @GetMapping("/member_login") // 로그인페이지
    public String member_login() {
        return "login";
    }

    @GetMapping("/api/logout")
    public String member_logout(Model model, HttpServletRequest request2, HttpServletResponse response) {
        try {
            HttpSession session = request2.getSession(false);
            session.invalidate();
            Cookie cookie = new Cookie("JSESSIONID", null);
            cookie.setPath("/");
            cookie.setMaxAge(0);
            response.addCookie(cookie);
            session = request2.getSession(true);
            System.out.println("세션 userId: " + session.getAttribute("userId"));
            return "login";
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
            return "login";
        }
    }

    @PostMapping("/api/login_check") // 로그인(아이디,패스워드) 체크
    public String checkMembers(@ModelAttribute AddMemberRequest request, Model model, HttpServletRequest request2,
            HttpServletResponse response) {
        try {
            HttpSession session = request2.getSession(false);
            if (session != null) {
                session.invalidate();
                Cookie cookie = new Cookie("JSESSIONID", null);
                cookie.setPath("/");
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
            session = request2.getSession(true);

            Member member = memberService.loginCheck(request.getEmail(), request.getPassword());
            String sessionId = UUID.randomUUID().toString();
            String email = request.getEmail();
            session.setAttribute("userId", sessionId);
            session.setAttribute("email", email);

            model.addAttribute("member", member);
            return "redirect:/board_list";
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
            return "login";
        }
    }

}
