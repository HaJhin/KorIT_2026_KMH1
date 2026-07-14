package com.korea.todo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.todo.dto.StudentDto;
import com.korea.todo.service.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class StudentController {
	
	private final StudentService studentService;
	
	@GetMapping("/students")
	public ResponseEntity<List<StudentDto>> getAllStudents() {
		List<StudentDto> list = studentService.getStudents();
		return ResponseEntity.ok(list);
	}
	
	@PostMapping
	public ResponseEntity<StudentDto> addStudent(@RequestBody StudentDto student) {
		StudentDto result =  studentService.addStudent(student);
		return ResponseEntity.ok(result);
	}
}
