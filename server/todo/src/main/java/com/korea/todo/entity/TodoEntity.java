package com.korea.todo.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Entity : DB테이블과 연결되는 객체
@Entity // 현재 클래스를 JPA가 관리하는 엔티티 클래스로 지정
@Table(name="Todo")
@Builder
@NoArgsConstructor
// 기본생성자가 필요한 이유는 객체를 먼저 만들고 값을 나중에 넣기 위함
@AllArgsConstructor
@Data
public class TodoEntity {
	
	@Id //현재 필드를 엔티티의 기본키로 지정
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id; // 이 객체의 아이디
	@Column(nullable = false)
	private String userId; // 이 객체를 생성한 유저의 아이디
	@Column(nullable = false)
	private String title; // 할일
	@Column(nullable = false)
	private boolean done; // 완료 여부
	
}
