package com.biel.todo.list.services;

import com.biel.todo.list.domain.dtos.TaskDTO;
import com.biel.todo.list.domain.entities.Status;
import com.biel.todo.list.domain.entities.Tasks;
import com.biel.todo.list.infra.Exceptions.NotFoundException;
import com.biel.todo.list.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

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
        if (task == null) throw new NoSuchElementException();
        return new TaskDTO(task.getName(), task.getDescription(), task.getStatus(), task.getPriority());
    }

    public TaskDTO findTaskByName(String name) {
        Tasks task = taskRepository.findByName(name);
        if (task == null) throw new NotFoundException("Task Not Found");
        return new TaskDTO(task.getName(), task.getDescription(), task.getStatus(), task.getPriority());
    }

    public void saveTask(TaskDTO taskData) {
        Tasks task = new Tasks(taskData);
        taskRepository.save(task);
    }

    public void deleteTask(Integer id) {
        if (!taskRepository.findById(id).isPresent()) throw new NotFoundException("Task Not Found");
        taskRepository.deleteById(id);
    }

    public void updateTask(Integer id, TaskDTO taskData) {
        Tasks task = taskRepository.findById(id).orElseThrow();
        task.setName(taskData.name());
        task.setDescription(taskData.description());
        task.setStatus((Status) taskData.status());
        task.setPriority(taskData.priority());
        taskRepository.save(task);
    }

}