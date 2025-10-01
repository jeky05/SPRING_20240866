package com.example.demo.model.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.model.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.repository.BlogRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class BlogService {
    @Autowired
    private final BlogRepository blogRepository;

    public List<Article> findAll() {
        return blogRepository.findAll();
    }
}
