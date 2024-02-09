package com.carniware.learning.app.section3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestJsp {
    @RequestMapping("/test-jsp")
    public String testJsp() {
        return "testJsp";
    }
}
