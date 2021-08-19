package com.iuliiarybets.todo.backend.controller;

import java.util.List;
import java.util.Optional;

import com.iuliiarybets.todo.backend.controller.model.Todo;

import org.springframework.data.repository.Repository;

public interface ToDoRepo extends Repository<Todo, Integer> {
    Optional<Todo> findById(Integer id);
    List<Todo> findAll();
}