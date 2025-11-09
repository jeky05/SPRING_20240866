package com.example.demo.model.domain;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "board")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)

public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title = "";

    @Column(name = "content", nullable = false)
    private String content = "";

    @Column(name = "vcount", nullable = false)
    private String vcount = "";

    @Column(name = "user", nullable = false)
    private String user = "";

    @Column(name = "likec", nullable = false)
    private String likec = "";

    @Column(name = "newdate", nullable = false)
    private String newdate = "";

    @Builder
    public Board(String title, String content, String vcount, String user, String likec, String newdate) {
        this.title = title;
        this.content = content;
        this.vcount = vcount;
        this.user = user;
        this.likec = likec;
        this.newdate = newdate;
    }

    public void update(String title, String content, String vcount, String user, String likec, String newdate) {
        this.title = title;
        this.content = content;
        this.vcount = vcount;
        this.user = user;
        this.likec = likec;
        this.newdate = newdate;
    }

}
