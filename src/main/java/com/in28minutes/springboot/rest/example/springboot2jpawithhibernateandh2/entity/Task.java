package com.in28minutes.springboot.rest.example.springboot2jpawithhibernateandh2.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Task {

    @Id
    @GeneratedValue
    private Long id;
    private String topic;
    @ManyToMany(mappedBy = "tasks")
    private List<Employee> employees;

    public Task() { }

    public Task(int id) {
        this.id = (long) id;
    }

    public Task(int id, String topic) {
        this.id = (long) id;
        this.topic = topic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

}