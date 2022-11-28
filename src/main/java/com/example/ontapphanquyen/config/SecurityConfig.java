//package com.example.ontapphanquyen.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests((requests) -> requests
//                        .antMatchers("/**")
//                        .permitAll()
////                        .antMatchers("/", "/user")
////                        .hasRole("USER")
////                        .antMatchers("/", "/admin")
////                        .hasRole("ADMIN")
////                        .antMatchers("/")
////                        .hasAnyRole("USER", "ADMIN")
//                )
//                .formLogin();
//
//        return http.build();
//    }
//
//    @Bean
//    public static BCryptPasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
