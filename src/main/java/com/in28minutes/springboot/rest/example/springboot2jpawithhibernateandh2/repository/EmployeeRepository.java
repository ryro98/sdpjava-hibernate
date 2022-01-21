package com.in28minutes.springboot.rest.example.springboot2jpawithhibernateandh2.repository;

import com.in28minutes.springboot.rest.example.springboot2jpawithhibernateandh2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    Employee findByName(String name);

}