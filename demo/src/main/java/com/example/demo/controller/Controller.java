package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;



@RestController
public class Controller {
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/students")
	public List<Student> getStudents(){
		return studentService.getStudents();
	}
	
	@PostMapping("/save")
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@PutMapping("/update/{roll}")
	public Student updateStudent(@PathVariable Integer roll) {
		return studentService.updateStudent(roll);
	}
}
