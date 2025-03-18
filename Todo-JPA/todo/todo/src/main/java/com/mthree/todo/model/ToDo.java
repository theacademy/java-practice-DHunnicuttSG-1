package com.mthree.todo.model;

import jakarta.persistence.*;

@Entity
@Table(name="todo")
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "todo", nullable = false)
    private String todo;

    @Column(name = "note", nullable = false)
    private String note;

    @Column(name = "finished")
    private boolean finished;

    public ToDo() {}

    public ToDo(Integer id, String todo, String note, boolean finished) {
        this.id = id;
        this.todo = todo;
        this.note = note;
        this.finished = finished;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}
