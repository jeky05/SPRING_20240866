package com.example.demo.model.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.demo.model.domain.Board;
import com.example.demo.model.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.repository.BoardRepository;
import com.example.demo.model.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.*;

@Service
@RequiredArgsConstructor

public class BlogService {
    @Autowired

    private final BoardRepository blogRepository;
    private final MemberRepository memberRepository;

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
        Member member = memberRepository.findByEmail(request.getUserEmail());
        if (member == null) {
            throw new RuntimeException("회원 없음");
        }
        return blogRepository.save(request.toEntity(member));
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
