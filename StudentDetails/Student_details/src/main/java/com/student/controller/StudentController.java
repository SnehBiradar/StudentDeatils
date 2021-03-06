package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.student.entity.Student;
import com.student.service.StudentService;

/**
 * @author User
 *
 */
@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService; 
	
	@Autowired
	private RestTemplate restTemplate; 
	
	/**
	 * @param Id
	 * @return
	 */
	@GetMapping("/{student_ID}")
	
	public Student getStudent(@PathVariable("student_ID")Long Student_Id) {
		
		//Student student= this.getStudent(Student_Id);
		
		List marks = this.restTemplate.getForObject("http://localhost:8082/marks/student/" + Student_Id, List.class);
		Student student = this.studentService.getStudent(Student_Id);
		student.setMarks(marks);
		return student;
		
	}
	//@GetMapping("/test")
	//public String getStudent()
//	{
	//	return "Sneha";
//	}
	
	
	

}
