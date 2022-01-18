package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student kkamggik = new Student(1L,"Kkamggik", LocalDate.of(1996,05,25),"kkamggik@gmail.com");
            Student cutie = new Student(2L,"Cutie",LocalDate.of(1994,02,25),"cutie@gmail.com");
            repository.saveAll(List.of(kkamggik,cutie));
        };
    }

}
