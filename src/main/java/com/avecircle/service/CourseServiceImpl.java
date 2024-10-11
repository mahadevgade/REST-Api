package com.avecircle.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avecircle.bind.Course;
import com.avecircle.repo.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;

	@Override
	public String upSert(Course course) {
		
		// this method use for Insert & update record.
		// If entity Obj does not contain PK then Insert the record;
		// If entity Obj contain PK then update the record;

		courseRepository.save(course);
		return "Success...";
	}

	@Override
	public Course getById(Integer cid) {

		Optional<Course> findById = courseRepository.findById(cid);

		if (findById.isPresent()) {

			return findById.get();
		}

		return null;
	}

	@Override
	public List<Course> getAllCourse() {

		return courseRepository.findAll();
	}

	@Override
	public String deleteById(Integer cid) {

		if (courseRepository.existsById(cid)) {

			courseRepository.deleteById(cid);
			return "Record Deleted...";

		} else {
			return "No Record Found...";

		}
	}

}
