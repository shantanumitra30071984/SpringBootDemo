package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.interfaces.StudentService;
import com.example.demo.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;

	@GetMapping("/sayHello")
	public String sayHello() {

		return "Hello";

	}

	@PostMapping("/createStudent")
	public Student createStudent(@RequestBody Student student) {
		studentService.saveStudent(student);
		System.out.println("saved successfully");
		return student;
	}

}
