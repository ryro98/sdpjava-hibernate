package com.in28minutes.springboot.rest.example.springboot2jpawithhibernateandh2.repository;

import com.in28minutes.springboot.rest.example.springboot2jpawithhibernateandh2.entity.Student;
import com.in28minutes.springboot.rest.example.springboot2jpawithhibernateandh2.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Student, Long>{
    @Query
    List<Task> findByTopic(String topic);

}