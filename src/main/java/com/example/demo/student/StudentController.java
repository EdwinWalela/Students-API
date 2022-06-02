package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
 * 
 * API LAYER
 * 
 */

@RestController // Makes the class to serve REST endpoints
@RequestMapping(path="/api/v1/students") // base endpoint
public class StudentController {

  // BEAN
  private final StudentService studentService;

  // Initialize controller
  @Autowired //Inject studentService into the constructor
  public StudentController(StudentService studentService){
    this.studentService = studentService;
  }

  @GetMapping
  public List<Student> getStudents(){
    return studentService.getStudents();
  }
}

