package com.example.demo.student;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

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

	public Optional<Student> getStudent(Long id){
		return this.studentRepository.findById(id);
	}

	public void createStudent(Student student){
		Optional<Student> exists = this.studentRepository.findStudentByEmail(student.getEmail());
		if(exists.isPresent()){
			System.out.println("Email in use");
		}else{
			this.studentRepository.save(student);
		}
	}

	@Transactional
	public void updateStudent(Long id,String name, String email){
		Student student = studentRepository.findById(id).orElseThrow(()-> new IllegalStateException("Student not found"));

		if(name != null && name.length()>0){
			student.setName(name);			
		}
		if(email !=null && email.length()>0){
			Optional<Student> exists = studentRepository.findStudentByEmail(email);
			if(exists.isPresent()){
				throw new IllegalStateException("Email in use");
			}
			student.setEmail(email);
		}
	}

	public void deleteStudent(Long id){
		// Check if student exists
		Boolean exists = this.studentRepository.existsById(id);
		if (!exists){
			throw new IllegalStateException("Student "+id+"doesn't exists");
		}
		this.studentRepository.deleteById(id);
	}
}
