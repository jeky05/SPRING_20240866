package com.example.demo.model.domain;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "member")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)

public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name = "";

    @Column(name = "email", nullable = false, unique = true)
    private String email = "";

    @Column(name = "password", nullable = false)
    private String password = "";

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "mobile", nullable = false)
    private String mobile = "";

    @Column(name = "address", nullable = false)
    private String address = "";

    @Builder
    public Member(String name, String email, String password, int age, String mobile, String address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.mobile = mobile;
        this.address = address;
    }

}
