package com.biel.todo.list.infra.Exceptions;

import com.biel.todo.list.domain.dtos.ExceptionDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity findIdException(NoSuchElementException e) {
        ExceptionDTO exceptionDTO = new ExceptionDTO("Task not found", "400");
        return ResponseEntity.badRequest().body(exceptionDTO);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity notFoundException( NotFoundException e) {
        ExceptionDTO exceptionDTO = new ExceptionDTO("Task not found", "400");
        return ResponseEntity.badRequest().body(exceptionDTO);
    }







}
