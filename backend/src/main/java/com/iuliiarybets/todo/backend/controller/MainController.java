package com.iuliiarybets.todo.backend.controller;

import java.util.ArrayList;
import java.util.List;

import com.iuliiarybets.todo.backend.controller.model.Todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private ToDoRepo toDoRepo;
   

    @GetMapping("/v1/liste")
    public List<Todo> getListe() {
        List<Todo> arr = toDoRepo.findAll();

        return arr;
    }
}
