package com.lambdaschool.todos.controller;


import com.lambdaschool.todos.model.Todo;
import com.lambdaschool.todos.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
public class TodosController
{
    @Autowired
    private TodoService todoService;

    // update todo by todoid
    @PutMapping(value = "/todo/{todoid}", consumes = {"application/json"}, produces = {"application/json"})
    public ResponseEntity<?> updateTodo(@RequestBody Todo todo, @PathVariable long todoid)
    {
        todoService.update(todo, todoid);
        return new ResponseEntity<>(todo, HttpStatus.OK);
    }
}
