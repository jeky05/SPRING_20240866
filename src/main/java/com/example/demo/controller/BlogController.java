package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.model.service.TestService;

@Controller
public class BlogController {

    @Autowired
    TestService testService;

    @GetMapping("/article_list")
    public String article_list() {
        return "article_list";
    }

}
