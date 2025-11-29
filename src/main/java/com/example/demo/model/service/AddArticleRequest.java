package com.example.demo.model.service;

import lombok.*;
import com.example.demo.model.domain.Board;
import com.example.demo.model.domain.Member;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class AddArticleRequest {
    private String title;
    private String content;
    private String vcount;
    private String userEmail;
    private String likec;
    private String newdate;

    public Board toEntity(Member member) {
        return Board.builder()
                .title(title)
                .content(content)
                .vcount(vcount)
                .user(member)
                .likec(likec)
                .newdate(newdate)
                .build();
    }

}
