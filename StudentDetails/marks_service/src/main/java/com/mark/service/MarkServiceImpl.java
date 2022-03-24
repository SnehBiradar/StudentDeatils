package com.mark.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.mark.entity.Marks;

@Service
public class MarkServiceImpl implements MarkService {
	List<Marks> list=List.of(
		new Marks(50L,60L,70L,1L),	
		new Marks(80L,60L,70L,2L),	
		new Marks(90L,60L,70L,3L)	
			);
	@Override
	public List<Marks> getMarksOfStudent(Long Student_ID){
		return list.stream().filter(Marks-> Marks.getStudent_ID().equals(Student_ID)).collect(Collectors.toList());
	}
}
