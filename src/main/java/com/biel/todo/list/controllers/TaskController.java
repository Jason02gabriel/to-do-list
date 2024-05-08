package com.biel.todo.list.controllers;

import com.biel.todo.list.domain.entities.Tasks;
import com.biel.todo.list.repositories.TaskRepository;
import com.biel.todo.list.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping
    public List<Tasks> getAllTasks() {
        return service.getAllTasks();
    }


}
