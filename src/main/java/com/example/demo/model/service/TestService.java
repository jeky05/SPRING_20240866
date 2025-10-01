package com.example.demo.model.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.repository.TestRepository;
import com.example.demo.model.domain.TestDB;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestService {
    @Autowired
    private final TestRepository testRepository;

    public TestDB findByName(String name) {
        return (TestDB) testRepository.findByName(name);
    }
}
