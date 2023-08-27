package com.teacher.manage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teacher.manage.domain.Teacher;

@RestController
@RequestMapping("/api/v1/teacher")
public class TeacherController {
	
	@GetMapping("/getTeacher")
	public Teacher getTeacher() {
		Teacher teacher = new Teacher(1,"sathish","venkata","chepuri","male",38);
		return teacher;
		
	}
}
