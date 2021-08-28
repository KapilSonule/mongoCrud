package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {

	List<Student> getStudents();

	Student addStudent(Student student);

	Student updateStudent(Integer roll);

}
