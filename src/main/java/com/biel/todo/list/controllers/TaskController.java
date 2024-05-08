package com.biel.todo.list.controllers;

import com.biel.todo.list.domain.entities.Tasks;
import com.biel.todo.list.repositories.TaskRepository;
import com.biel.todo.list.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping
    public ResponseEntity<List<Tasks>> getAllTasks() {
        return ResponseEntity.ok(service.getAllTasks());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Tasks> getTaskById(@PathVariable Integer id){
        return ResponseEntity.ok(service.findTaskById(id));
    }


}
