package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// <Object-type,id type>
@Repository // Responsible for data access
public interface StudentRepository extends JpaRepository<Student,Long>{
  
}
