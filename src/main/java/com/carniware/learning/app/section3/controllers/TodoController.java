package com.carniware.learning.app.section3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.carniware.learning.app.section3.services.TodoService;

@Controller
public class TodoController {
    private TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @RequestMapping("list-todo")
    public String listTodo(@RequestParam String username, ModelMap model) {
        var todos = service.findByUsername(username);

        model.put("username", username);
        model.put("todos", todos);
        return "listTodos";
    }
}
