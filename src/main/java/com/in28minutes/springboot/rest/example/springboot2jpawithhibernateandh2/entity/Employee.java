package com.in28minutes.springboot.rest.example.springboot2jpawithhibernateandh2.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToMany(cascade = CascadeType.REMOVE)
    private List<Task> tasks;

    public Employee() {super();}

    public Employee(String name) {
        super();
        this.name = name;
    }

    public Employee(Long id,String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return String.format("Student [id=%s, name=%s]", id, name);
    }
}