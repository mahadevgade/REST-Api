package com.avecircle.service;

import java.util.List;

import com.avecircle.bind.Course;

public interface CourseService {
	
	public String upSert(Course course);
	
	public Course getById(Integer cid);
	
	public List<Course> getAllCourse();
	
	public String deleteById(Integer cid);

}
