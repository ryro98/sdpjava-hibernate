package com.in28minutes.springboot.rest.example.springboot2jpawithhibernateandh2;

import com.in28minutes.springboot.rest.example.springboot2jpawithhibernateandh2.entity.Employee;
import com.in28minutes.springboot.rest.example.springboot2jpawithhibernateandh2.entity.Student;
import com.in28minutes.springboot.rest.example.springboot2jpawithhibernateandh2.repository.EmployeeRepository;
import com.in28minutes.springboot.rest.example.springboot2jpawithhibernateandh2.repository.StudentRepository;
import com.in28minutes.springboot.rest.example.springboot2jpawithhibernateandh2.repository.TaskRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringBoot2JpaWithHibernateAndH2Application implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentRepository studentRepository;
	EmployeeRepository employeeRepository;
	TaskRepository taskRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2JpaWithHibernateAndH2Application.class, args);
	}

	@Override
	public void run(String... args) {

//		logger.info("Student id 10001 -> {}", studentRepository.findById(10001L));
//
//		logger.info("All users 1 -> {}", studentRepository.findAll());
//
//		//Insert
//		logger.info("Inserting -> {}", studentRepository.save(new Student("John", "A1234657")));
//
//		//Update
//		logger.info("Update 10001 -> {}", studentRepository.save(new Student(10001L, "Name-Updated", "New-Passport")));
//
//		studentRepository.deleteById(10002L);
//
//		logger.info("All users 2 -> {}", studentRepository.findAll());

//		logger.info("Find by name -> {}",
//				repository.info());

		logger.info("Inserting -> {}", employeeRepository.save(new Employee("Dawid")));
		logger.info("Inserting -> {}", employeeRepository.save(new Employee("Damian")));
		logger.info("Inserting -> {}", employeeRepository.save(new Employee("Dominik")));
		employeeRepository.deleteById(2L);
		logger.info("All employees -> {}", employeeRepository.findAll());
	}

}
