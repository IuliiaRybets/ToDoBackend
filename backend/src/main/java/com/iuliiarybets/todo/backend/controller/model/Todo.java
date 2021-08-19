package com.iuliiarybets.todo.backend.controller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="todo")
@Entity
public class Todo {
    @Id
    @Column
    private Integer id;

    @Column(name = "todo_name")
    private String name;

    @Column(name = "todo_status")
    private String status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
