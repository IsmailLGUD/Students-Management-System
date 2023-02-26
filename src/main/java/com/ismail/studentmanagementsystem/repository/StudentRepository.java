package com.ismail.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ismail.studentmanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	
	
}
