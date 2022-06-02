package com.example.demo.student;

import java.time.LocalDate;

public class Student {
  private Long id;
  private String name;
  private Integer age;
  private LocalDate dob;
  private String email;


  public Student(){

  }

  public Student(Long id, String name, Integer age, LocalDate dob, String email){
    this.id = id;
    this.name = name;
    this.age = age;
    this.dob = dob;
    this .email = email;
  }

  public Student(String name, Integer age,LocalDate dob, String email){
    this.name = name;
    this.age = age;
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
    return age;
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
