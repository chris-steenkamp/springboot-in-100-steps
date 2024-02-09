package com.carniware.learning.app.section3.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.carniware.learning.app.section3.models.Todo;

@Service
public class TodoService {
    private static List<Todo> todos = List.of(
            new Todo(0, "chris", "This is the start item.", LocalDate.of(2024, 04, 03), false),
            new Todo(1, "chris", "This is the end item.", LocalDate.of(2024, 07, 23), false));

    public List<Todo> findByUsername(String username) {
        return todos.stream().filter(x -> x.getUsername().equalsIgnoreCase(username)).toList();
    }
}
