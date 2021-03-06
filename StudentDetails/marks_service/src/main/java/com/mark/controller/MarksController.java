package com.mark.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mark.entity.Marks;
import com.mark.service.MarkService;

@RequestMapping("/marks") //localhost:8082/marks/student/1
@RestController
public class MarksController {
	@Autowired
	private MarkService markService; 
	
	@RequestMapping("student/{Student_ID}")
	public List<Marks> getMarks(@PathVariable("Student_ID") Long Student_ID){
	
		return this.markService.getMarksOfStudent(Student_ID);
	}
	

}
