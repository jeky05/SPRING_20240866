package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration // 설정 클래스 지정
@EnableWebSecurity // 보안 활성화
public class SecurityConfig {
    @Bean // 명시성 의존성 주입 : Autowired와 다름
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .headers(headers -> headers
                        .addHeaderWriter((request, response) -> {
                            response.setHeader("X-XSS-Protection", "1; mode = block");
                        }))
                .csrf(csrf -> csrf.disable())
                .sessionManagement(session -> session
                        .invalidSessionUrl("/session-expired")
                        .maximumSessions(1)
                        .maxSessionsPreventsLogin(true));

        return http.build(); // 필터체인을 통해 보안설정(httpSecurity)를 반환
    }

    @Bean // 암호화설정
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); // 비밀번호 암호화 객체 반환
    }
}
