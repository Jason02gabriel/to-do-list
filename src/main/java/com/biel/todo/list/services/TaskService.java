package com.biel.todo.list.services;

import com.biel.todo.list.domain.entities.Tasks;
import com.biel.todo.list.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Tasks> getAllTasks() {
        return taskRepository.findAll();
    }

    public Tasks findTaskById(Integer id) {
        return taskRepository.findById(id).orElseThrow();
    }

}