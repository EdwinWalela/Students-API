package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/*
 * 
 * SERVICE LAYER
 * 
 */

// Handle business logic
@Service // This is a service class
public class StudentService {
	public List<Student> getStudents(){
		// Mapped to JSON
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(
			1L,
			"edwin",
			21,
			LocalDate.of(1999,Month.SEPTEMBER,26),
			"edwinwalela@gmail.com"
			));

		return students;
	}
}
