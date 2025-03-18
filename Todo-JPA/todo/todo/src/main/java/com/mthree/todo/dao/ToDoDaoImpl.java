package com.mthree.todo.dao;

import com.mthree.todo.model.ToDo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class ToDoDaoImpl implements ToDoDao {

    @PersistenceContext
    private EntityManager em;


    @Override
    public void addTodo(ToDo todo) {
        em.persist(todo);
    }

    @Override
    public List<ToDo> getAllTodos() {
        String sql = "select * from todo";
        // String sql = "select id, todo, note, finished from todo t"  used when using em.createQuery
        return (List<ToDo>)em.createNativeQuery(sql).getResultList();
    }

    @Override
    public void deleteTodo(int id) {
        em.remove(getTodoById(id));
    }

    @Override
    public ToDo getTodoById(int id) {
        return em.find(ToDo.class, id);
    }

    @Override
    public void updateTodo(ToDo todo) {
        ToDo upToDo = getTodoById(todo.getId());

        upToDo.setTodo(todo.getTodo());
        upToDo.setNote(todo.getNote());
        upToDo.setFinished(todo.isFinished());

        em.flush();  //updates the todo
    }
}
