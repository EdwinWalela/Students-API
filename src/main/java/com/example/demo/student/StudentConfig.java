package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class StudentConfig {
  // Add students to DB
  @Bean
  CommandLineRunner commandLineRunner(StudentRepository repository){
    return args -> {
      Student edwin = new Student(
        1L,
        "edwin",
        22,
        LocalDate.of(1999,Month.SEPTEMBER,26),
        "edwin@email.com"
      );

      Student miriam = new Student(
        "miriam",
        21,
        LocalDate.of(2002,Month.JANUARY,26),
        "miriam@email.com"
      );

      repository.saveAll(List.of(edwin,miriam));

    };
  }
}
