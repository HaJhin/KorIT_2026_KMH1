package com.korea.todo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.todo.dto.StudentDto;

@Service
public class StudentService {
	ArrayList<StudentDto> list = new ArrayList<StudentDto>();
	private int sequence= 1;
	
    public StudentService() {
        StudentDto student1 = StudentDto.builder().id(sequence++).name("홍길동").course("스프링부트 개발").email("A@test.com").build();
        StudentDto student2 = StudentDto.builder().id(sequence++).name("임꺽정").course("클라우드 개발").email("B@test.net").build();
        
        list.add(student1);
        list.add(student2);
    } // ctor ed
    
    // 전체 학생 반환
    public List<StudentDto> getStudents() {
    	return list;
    } // getStudents ed
    
    // 학생 추가 및 신규학생 반환
    public StudentDto addStudent(StudentDto studentDto) {
    	StudentDto studentN = StudentDto.builder()
    			.id(sequence++)
    			.name(studentDto.getName())
    			.course(studentDto.getCourse())
    			.email(studentDto.getEmail()).build();
    	list.add(studentN);
    	return studentN;
    } // addStudent ed
}
