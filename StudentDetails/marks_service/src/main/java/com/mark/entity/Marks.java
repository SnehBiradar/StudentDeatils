package com.mark.entity;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;


//@Entity
public class Marks {
	//@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private Long english;
	private Long science;
	private Long social_studies; 
	private Long Student_ID;
	
	public Long getEnglish() {
		return english;
	}

	public void setEnglish(Long english) {
		this.english = english;
	}

	public Long getScience() {
		return science;
	}

	public void setScience(Long science) {
		this.science = science;
	}

	public Long getSocial_studies() {
		return social_studies;
	}

	public void setSocial_studies(Long social_studies) {
		this.social_studies = social_studies;
	}

	public Long getStudent_ID() {
		return Student_ID;
	}

	public void setStudent_ID(Long student_ID) {
		Student_ID = student_ID;
	}

	public Marks() {
		super();
	}

	public Marks(Long english, Long science, Long social_studies, Long student_ID) {
		super();
		this.english = english;
		this.science = science;
		this.social_studies = social_studies;
		Student_ID = student_ID;
	}
	
	
	
	

}
