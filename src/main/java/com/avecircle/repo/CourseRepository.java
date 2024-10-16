package com.avecircle.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avecircle.bind.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Serializable>{

}
