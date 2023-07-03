//package com.example.backend_sfm.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//import static org.springframework.security.web.util.matcher.AntPathRequestMatcher.antMatcher;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests().requestMatchers(antMatcher("/h2-console/**")).permitAll()
//                .and().csrf().ignoringRequestMatchers(antMatcher("/h2-console/**"))
//                .and().headers().frameOptions().disable();
//
//        return http.build();
//    }
//}
