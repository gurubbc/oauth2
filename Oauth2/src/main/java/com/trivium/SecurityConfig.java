package com.trivium;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
public class SecurityConfig {

public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    return http
        .authorizeHttpRequests(auth ->
        	auth
            .requestMatchers("/").permitAll()  // Allow access to /public without authentication
            .anyRequest().authenticated()       // All other requests require authentication
        ).build();
       
}
}

