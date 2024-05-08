package com.biel.todo.list.domain.dtos;

import com.biel.todo.list.domain.entities.Priority;
import com.biel.todo.list.domain.entities.Status;

public record TaskDTO(String name, String description, Status status, Priority priority) {
}
