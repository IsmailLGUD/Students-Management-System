package com.ismail.studentmanagementsystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ismail.studentmanagementsystem.entity.Student;
import com.ismail.studentmanagementsystem.repository.StudentRepository;
import com.ismail.studentmanagementsystem.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	
}
