package com.lambdaschool.todos.repository;

import com.lambdaschool.todos.model.Todo;
import com.lambdaschool.todos.view.CountTodos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface TodoRepository extends CrudRepository<Todo, Long>
{
    @Query(value = "SELECT u.username, count(q.todoid) as counttodos " +
                   "FROM todos q JOIN users u on q.userid = u.userid " +
                   "GROUP BY u.username", nativeQuery = true)
    ArrayList<CountTodos> getCountTodos();
}
