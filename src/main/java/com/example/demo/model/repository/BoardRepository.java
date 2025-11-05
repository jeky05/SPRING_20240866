package com.example.demo.model.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.domain.Board;
import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
    // List<Board> findAll();
}
