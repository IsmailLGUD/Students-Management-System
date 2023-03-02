package com.ismail.studentmanagementsystem.service;

import java.util.List;

import com.ismail.studentmanagementsystem.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	//Student saveStudent(Student student);

	
}
