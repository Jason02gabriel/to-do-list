package com.biel.todo.list.repositories;

import com.biel.todo.list.domain.entities.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Tasks, Integer> {
    public Tasks findByName(String name);
}
