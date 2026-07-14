package com.korea.todo.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
// 기본생성자가 필요한 이유는 객체를 먼저 만들고 값을 나중에 넣기 위함
@AllArgsConstructor
@Data
public class StudentEntity {
	private int id;
	private String name;
	private String course;
	private String email;
}
