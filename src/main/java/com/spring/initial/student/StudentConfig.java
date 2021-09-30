package com.spring.initial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
          Student ayesh = new Student(
                  1L,
                  "Ayesh Rodrigo",
                  "ayesh.rodrigo@gmail.com",
                  LocalDate.of(1991, Month.DECEMBER, 28)
          );

            Student natalie = new Student(
                    "Natalie Kuruppu",
                    "natalie.kuruppu@gmail.com",
                    LocalDate.of(1995, Month.JANUARY, 23)
            );

            repository.saveAll(
                    List.of(ayesh, natalie)
            );
        };

    }
}
