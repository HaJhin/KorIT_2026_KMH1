package com.korea.todo.entity;

import org.hibernate.annotations.UuidGenerator;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserEntity {
	
	@Id @UuidGenerator // UUid 값을 자동으로 생성한다.
	private String id;
	
	@Column(updatable = false, nullable = false)
	private String userName;
	
	private String password;
	
	private String role;

}
