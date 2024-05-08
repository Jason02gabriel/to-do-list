package com.biel.todo.list.domain.entities;
import com.biel.todo.list.domain.dtos.TaskDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tasks")
public class Tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    @Enumerated(EnumType.STRING)
    private Status status;
    @Enumerated(EnumType.STRING)
    private Priority priority;

    public Tasks(TaskDTO taskData) {
        name = taskData.name();
        description = taskData.description();
        status = taskData.status();
        priority = taskData.priority();
    }
}
