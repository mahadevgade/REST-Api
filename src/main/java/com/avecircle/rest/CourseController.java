package com.avecircle.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avecircle.bind.Course;
import com.avecircle.service.CourseService;

@RestController
@RequestMapping("student")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@PostMapping(value = "/course" ,  produces = "text/plain", consumes = "application/json")
	public ResponseEntity<String> addCourses(@RequestBody Course course) {
		String status = courseService.upSert(course);

		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}

	@GetMapping(value = "/course/{cid}", produces = "application/json")
	public ResponseEntity<Course> getCourse(@PathVariable("cid") Integer cid) {
		Course course = courseService.getById(cid);
		return new ResponseEntity<>(course, HttpStatus.OK);

	}

	@GetMapping(value = "/courses", produces = "application/json")
	public ResponseEntity<List<Course>> getAllCourses() {
		List<Course> course = courseService.getAllCourse();
		return new ResponseEntity<>(course, HttpStatus.OK);
	}

	@PutMapping(value = "/course",  produces = "text/plain", consumes = "application/json")
	public ResponseEntity<String> updateCourse(@RequestBody Course course) {
		String status = courseService.upSert(course);
		return new ResponseEntity<>(status, HttpStatus.OK);

	}

	@DeleteMapping(value = "course/{cid}", produces = "text/plain")
	public ResponseEntity<String> deleteCourse(@PathVariable("cid") Integer cid) {
		String status = courseService.deleteById(cid);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

}
