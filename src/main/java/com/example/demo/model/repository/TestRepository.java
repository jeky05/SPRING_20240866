package com.example.demo.model.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.domain.TestDB;

@Repository

public interface TestRepository extends JpaRepository<TestDB, Long> {
    TestDB findByName(String name);
}
