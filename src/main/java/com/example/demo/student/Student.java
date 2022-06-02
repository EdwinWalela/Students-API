package com.example.demo.student;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity // Mark this class as an entity
@Table(name = "students") // Map Class to DB Table
public class Student {
  @Id
  @SequenceGenerator(
    name = "student_sequence",
    sequenceName = "student_sequence",
    allocationSize = 1
  )

  @GeneratedValue(
    strategy = GenerationType.SEQUENCE,
    generator = "student_sequence"

  )
  private Long id;
  private String name;
  @Transient //field below isnt a column in our db (it will be calculated)
  private Integer age;
  private LocalDate dob;
  private String email;


  public Student(){

  }

  public Student(Long id, String name, LocalDate dob, String email){
    this.id = id;
    this.name = name;
    this.dob = dob;
    this .email = email;
  }

  public Student(String name, LocalDate dob, String email){
    this.name = name;
    this.dob = dob;
    this .email = email;
  }

  public Long getId(){
    return this.id;
  }
  public String getName(){
    return this.name;
  }
  public LocalDate getDob() {
    return dob;
  }
  public String getEmail() {
    return email;
  }
  public Integer getAge() {
    // Calculate age from dob
    return Period.between(this.dob, LocalDate.now()).getYears();
  }
  public void setAge(Integer age) {
    this.age = age;
  }
  public void setDob(LocalDate dob) {
    this.dob = dob;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setId(Long id) {
    this.id = id;
  }
  @Override
  public String toString() {
   return "Student{"+
    "id="+id+
    ", name='"+name+"'"+
    ", email='"+email+"'"+
    ", dob='"+dob+"'"+
    ", age='"+age+"' "+
    "}";
  }
}
