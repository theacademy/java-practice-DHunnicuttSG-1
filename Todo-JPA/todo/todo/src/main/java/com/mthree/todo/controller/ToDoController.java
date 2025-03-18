package com.mthree.todo.controller;

import com.mthree.todo.TodoApplication;
import com.mthree.todo.dao.ToDoDao;
import com.mthree.todo.model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ToDoController {

    @Autowired
    private ToDoDao dao;

    @GetMapping("/todos")
    public ResponseEntity<List<ToDo>> getAllTodos() {
        List<ToDo> toDoList = dao.getAllTodos();
        return ResponseEntity.status(HttpStatus.OK).body(toDoList);
    }

    @GetMapping("/todo/{findId}")
    public ResponseEntity<ToDo> getTodoById(@PathVariable("findId") Integer id) {
        ToDo toDo = dao.getTodoById(id);
        return ResponseEntity.status(HttpStatus.OK).body(toDo);
    }

    @PostMapping("/todo")
    public ResponseEntity<String> addTodo(@RequestBody ToDo todo){
        dao.addTodo(todo);
        return ResponseEntity.status(HttpStatus.CREATED).body("New ToDo added successfully!");
    }

    @DeleteMapping("/todo/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable("id") Integer id) {
        dao.deleteTodo(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/todo")
    public ResponseEntity<ToDo> updateTodo(@RequestBody ToDo todo) {
        dao.updateTodo(todo);
        return new ResponseEntity<ToDo>(todo, HttpStatus.OK);
    }
}
