package com.carniware.learning.app.section3.controllers;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password) {
        return "Chris".equalsIgnoreCase(username) && "test".equals(password);
    }
}
