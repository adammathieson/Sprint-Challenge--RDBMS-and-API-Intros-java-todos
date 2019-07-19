package com.lambdaschool.todos.service;

import com.lambdaschool.todos.model.Todo;
//import com.lambdaschool.todos.view.CountTodos;
import com.lambdaschool.todos.view.CountTodos;

import java.util.ArrayList;
import java.util.List;

public interface TodoService
{
    List<Todo> findAll();

    Todo findQuoteById(long id);

    List<Todo> findByUserName(String username);

    void delete(long id);

    Todo save(Todo quote);

    Todo update(Todo quote, long id);

    ArrayList<CountTodos> getCountTodos();
}
