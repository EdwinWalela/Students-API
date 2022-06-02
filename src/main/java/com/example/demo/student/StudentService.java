package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * 
 * SERVICE LAYER
 * 
 */

// Handle business logic
@Service // This is a service class
public class StudentService {

	private final StudentRepository studentRepository;

	@Autowired // Dependancy injection
	public StudentService(StudentRepository studentRepository){
		this.studentRepository = studentRepository;
	}

	public List<Student> getStudents(){
		List<Student> students = this.studentRepository.findAll();
		return students;
	}

	public void createStudent(){
		
	}
}
