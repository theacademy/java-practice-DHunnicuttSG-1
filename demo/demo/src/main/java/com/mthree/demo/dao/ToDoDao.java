package com.mthree.demo.dao;

import com.mthree.demo.model.ToDo;

import java.util.List;

public interface ToDoDao {

    List<ToDo> getAll();

    ToDo add(ToDo todo);

    ToDo findById(int id);

    boolean update(ToDo todo);

    boolean delete(int id);
}
