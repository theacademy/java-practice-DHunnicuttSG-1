package com.mthree.todo.dao;

import com.mthree.todo.model.ToDo;

import java.util.List;

public interface ToDoDao {
    void addTodo(ToDo todo);
    List<ToDo> getAllTodos();
    void deleteTodo(int id);
    ToDo getTodoById(int id);
    void updateTodo(ToDo todo);
}
