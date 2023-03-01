package com.ismail.studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ismail.studentmanagementsystem.entity.Student;
import com.ismail.studentmanagementsystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
		
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student ("Mosaddek", "Mahdi", "mosaddekmahdi@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("Ismail", "Hossain", "ismailkohit@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("Muhaimin", "Munim", "muhaiminmunim@gmail.com");
		studentRepository.save(student3);
		
	
	}

}
