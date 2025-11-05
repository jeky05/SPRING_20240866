package com.example.demo.model.service;

import lombok.*;
import com.example.demo.model.domain.Article;
import com.example.demo.model.domain.Board;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class AddArticleRequest {
    private String title;
    private String content;
    private String count;
    private String user;
    private String likec;
    private String newdate;

    public Board toEntity() {
        return Board.builder()
                .title(title)
                .content(content)
                .count(count)
                .user(user)
                .likec(likec)
                .newdate(newdate)
                .build();
    }

    // public Article toEntity() {
    // return Article.builder()
    // .title(title)
    // .content(content)
    // .build();
    // }
}
