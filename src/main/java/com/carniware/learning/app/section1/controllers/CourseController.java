package com.carniware.learning.app.section1.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carniware.learning.app.section1.domains.Course;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
			new Course(1, "Learn ABCs", "carni"),
			new Course(2, "Learn 123s", "carni"),
			new Course(3, "Learn Birds and Bees", "carni")
		);
	}
}
