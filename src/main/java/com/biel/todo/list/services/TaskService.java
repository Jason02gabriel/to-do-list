package com.biel.todo.list.services;

import com.biel.todo.list.domain.dtos.TaskDTO;
import com.biel.todo.list.domain.entities.Tasks;
import com.biel.todo.list.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<TaskDTO> getAllTasks() {
        List<Tasks> tasks = taskRepository.findAll();
        List<TaskDTO> taskDTOs = new ArrayList<>();
        for (Tasks task : tasks) {
            taskDTOs.add(new TaskDTO(task.getName(), task.getDescription(), task.getStatus(), task.getPriority()));
        }
        return taskDTOs;
    }

    public TaskDTO findTaskById(Integer id) {
        Tasks task = taskRepository.findById(id).orElseThrow();
        return new TaskDTO(task.getName(), task.getDescription(), task.getStatus(), task.getPriority());
    }

    public TaskDTO findTaskByName(String name) {
        Tasks task = taskRepository.findByName(name);
        return new TaskDTO(task.getName(), task.getDescription(), task.getStatus(), task.getPriority());
    }

    public void saveTask(TaskDTO taskData) {
        Tasks task = new Tasks(taskData);
        taskRepository.save(task);
    }

}