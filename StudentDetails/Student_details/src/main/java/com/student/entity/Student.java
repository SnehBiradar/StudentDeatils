package com.student.entity;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private Long Student_ID;
	private String Name;
	private String Student_Class;

	List<Marks> marks= new ArrayList<>();

	public Student() {
		super();
	}

	public Student(Long student_ID, String name, String class1) {
		super();
		Student_ID = student_ID;
		Name = name;
		Student_Class = class1;
	}

	public Student(Long student_ID, String name, String class1, List<Marks> marks) {
		super();
		Student_ID = student_ID;
		Name = name;
		Student_Class = class1;
		this.marks = marks;
	}

	public Long getStudent_ID() {
		return Student_ID;
	}

	public void setStudent_ID(Long student_ID) {
		Student_ID = student_ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getStudent_Class() {
		return Student_Class;
	}

	public void setStudent_Class(String student_Class) {
		Student_Class = student_Class;
	}

	public List<Marks> getMarks() {
		return marks;
	}

	public void setMarks(List<Marks> marks) {
		this.marks = marks;
	}
	
}
