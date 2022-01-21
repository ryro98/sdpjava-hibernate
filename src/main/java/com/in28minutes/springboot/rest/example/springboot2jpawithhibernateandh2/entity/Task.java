package com.in28minutes.springboot.rest.example.springboot2jpawithhibernateandh2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Task {
    @Id
    @GeneratedValue
    private Long id;
    private String topic;
    //Some other code

    @ManyToMany(mappedBy = "tasks")
    private List<Student> students;

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

    public List<Student> getEmployees() {
        return students;
    }

    public void setEmployees(List<Student> students) {
        this.students = students;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}