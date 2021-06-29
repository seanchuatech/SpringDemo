package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student mariam = new Student(
					
					"Mariam",
					"Mariam@gmail.com",
					LocalDate.of(2000, 1, 5)
					);
			Student sean = new Student(
					
					"Lean",
					"sean@gmail.com",
					LocalDate.of(1995, 1, 5)
					);
			Student leonard = new Student(
			
					"Leonard",
					"Leonard@gmail.com",
					LocalDate.of(1992, 1, 5)
					);
			
			repository.saveAll(List.of(mariam, sean, leonard));
		};
	}
}
