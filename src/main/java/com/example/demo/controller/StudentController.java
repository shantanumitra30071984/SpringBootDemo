package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.interfaces.StudentService;
import com.example.demo.model.Student;

import ch.qos.logback.core.net.SyslogOutputStream;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;

	@GetMapping("/sayHello")
	public String sayHello() {
       System.out.println("Test");
		return "Hello";

	}

	@PostMapping("/createStudent")
	public Student createStudent(@RequestBody Student student) {
		System.out.println("Testing Build");
		studentService.saveStudent(student);
		System.out.println("saved successfully");
		return student;
	}

}
