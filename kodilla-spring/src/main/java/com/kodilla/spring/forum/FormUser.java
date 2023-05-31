package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class FormUser {
    private String username;

    public FormUser() {
        this.username = "John Smith";
    }

    public String getUsername() {
        return username;
    }
}
