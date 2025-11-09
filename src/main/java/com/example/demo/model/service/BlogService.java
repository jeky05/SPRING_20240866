package com.example.demo.model.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.demo.model.domain.Article;
import com.example.demo.model.domain.Board;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.repository.BlogRepository;
import com.example.demo.model.repository.BoardRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class BlogService {
    @Autowired
    // private final BlogRepository blogRepository;
    private final BoardRepository blogRepository;

    // public List<Article> findAll() {
    // return blogRepository.findAll();
    // }

    // public Optional<Article> findById(Long id) {
    // return blogRepository.findById(id);
    // }

    public List<Board> findAll() {
        return blogRepository.findAll();
    }

    public Optional<Board> findById(Long id) {
        return blogRepository.findById(id);
    }

    public Board save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    // public Article save(AddArticleRequest request) {
    // return blogRepository.save(request.toEntity());
    // }

    public void update(Long id, AddArticleRequest request) {
        Optional<Board> optionalBoard = blogRepository.findById(id);
        optionalBoard.ifPresent(board -> {
            board.update(request.getTitle(), request.getContent(), board.getVcount(), board.getUser(),
                    board.getLikec(), board.getNewdate());
            blogRepository.save(board);
        });
    }
    // public void update(Long id, AddArticleRequest request) {
    // Optional<Article> optionalArticle = blogRepository.findById(id);
    // optionalArticle.ifPresent(article -> {
    // article.update(request.getTitle(), request.getContent());
    // blogRepository.save(article);
    // });
    // }

    public void delete(Long id) {
        blogRepository.deleteById(id);
    }
}
