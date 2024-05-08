package com.biel.todo.list.controllers;

import com.biel.todo.list.domain.dtos.TaskDTO;
import com.biel.todo.list.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping
    public ResponseEntity<List<TaskDTO>> getAllTasks() {
        return ResponseEntity.ok(service.getAllTasks());
    }
    @GetMapping("/{id}")
    public ResponseEntity<TaskDTO> getTaskById(@PathVariable Integer id){
        return ResponseEntity.ok(service.findTaskById(id));
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<TaskDTO> getTaskByName(@PathVariable String name){
        return ResponseEntity.ok(service.findTaskByName(name));
    }

    @PostMapping
    public ResponseEntity<Void> saveTask(@RequestBody TaskDTO taskData){
        service.saveTask(taskData);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
