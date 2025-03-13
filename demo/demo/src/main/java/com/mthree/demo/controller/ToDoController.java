package com.mthree.demo.controller;

import com.mthree.demo.dao.ToDoDao;
import com.mthree.demo.model.ToDo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/td")
@CrossOrigin
public class ToDoController {

    private final ToDoDao dao;

    public ToDoController(ToDoDao dao) {
        this.dao = dao;
    }

    @GetMapping("/todos")
    public List<ToDo> getAll() {
        return dao.getAll();
    }

    @PostMapping("/todo")
    public ToDo add(@RequestBody ToDo todo) {
        return dao.add(todo);
    }

    @GetMapping("/todo/{id}")
    public ToDo getById(@PathVariable int id) {
        return dao.findById(id);
    }

    @PutMapping("/todo/{id}")
    public boolean updateToDo(@PathVariable int id, @RequestBody ToDo todo){
        return dao.update(todo);
    }

    @DeleteMapping("/todo/{id}")
    public boolean deleteToDo(@PathVariable int id){
        return dao.delete(id);
    }
}
