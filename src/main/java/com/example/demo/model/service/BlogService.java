package com.example.demo.model.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.demo.model.domain.Board;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.*;

@Service
@RequiredArgsConstructor

public class BlogService {
    @Autowired

    private final BoardRepository blogRepository;

    public List<Board> findAll() {
        return blogRepository.findAll();
    }

    public Optional<Board> findById(Long id) {
        return blogRepository.findById(id);
    }

    public Page<Board> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    public Page<Board> searchByKeyword(String keyword, Pageable pageable) {
        {
            return blogRepository.findByTitleContainingIgnoreCase(keyword, pageable);
        }
    }

    public Board save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    public void update(Long id, AddArticleRequest request) {
        Optional<Board> optionalBoard = blogRepository.findById(id);
        optionalBoard.ifPresent(board -> {
            board.update(request.getTitle(), request.getContent(), board.getVcount(), board.getUser(),
                    board.getLikec(), board.getNewdate());
            blogRepository.save(board);
        });
    }

    public void delete(Long id) {
        blogRepository.deleteById(id);
    }
}
