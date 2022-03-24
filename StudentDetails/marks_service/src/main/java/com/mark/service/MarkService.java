package com.mark.service;

import java.util.List;

import com.mark.entity.Marks;

public interface MarkService {
	public List<Marks> getMarksOfStudent(Long Student_ID);

}
