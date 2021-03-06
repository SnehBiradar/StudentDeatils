package com.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.entity.Student;

@Service
public class StudentServiceImpl implements StudentService  {
	List<Student> list=List.of(
		new Student(1L,"Sneha Biradar","1"),
		new Student(2L,"Archana Khune","1"),
		new Student(3L,"Nilam Rane","3")
		);
	
	@Override
	public Student getStudent(Long Id) {
		return list.stream().filter(Student->Student.getStudent_ID().equals(Id)).findAny().orElse(null);
	}
	

}
