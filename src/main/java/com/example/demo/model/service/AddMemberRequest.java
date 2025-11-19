package com.example.demo.model.service;

import lombok.*;
import com.example.demo.model.domain.Member;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class AddMemberRequest {
    @NotBlank
    @Pattern(regexp = "^[ㄱ-ㅎ가-힣a-z0-9-_]", message = "이름은 한글 또는 영문이어야 합니다.")
    private String name;

    @NotBlank
    @Email(message = "유효한 이메일 형식이어야 합니다.")
    private String email;

    @NotBlank
    @Pattern(regexp = "(?=.*[a-z])(?=.*[A-Z]).{8,}$", message = "비밀번호는 8글자 이상의 대소문자를 포함해야 합니다.")
    private String password;

    @Min(value = 19, message = "나이는 19세 이상이어야 합니다.")
    @Max(value = 90, message = "나이는 90세 이하이어야 합니다.")
    @Pattern(regexp = "^[0-9]+$", message = "나이는 숫자만 입력해야 합니다.")
    private String age;

    @NotNull
    private String mobile;

    @NotNull
    private String address;

    public Member toEntity() {
        return Member.builder()
                .name(name)
                .email(email)
                .password(password)
                .age(age)
                .mobile(mobile)
                .address(address)
                .build();
    }

}
