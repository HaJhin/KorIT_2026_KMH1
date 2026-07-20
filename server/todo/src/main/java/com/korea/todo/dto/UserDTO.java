package com.korea.todo.dto;

import com.korea.todo.entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	private String token;
	private String userName;
	private String password;
	private String id;

	public UserDTO(UserEntity entity) {
		this.userName = entity.getUserName();
		this.password = entity.getPassword();
	}

	public static UserEntity toEntity(UserDTO dto) {
		return new UserEntity().builder()
				.userName(dto.getUserName())
				.password(dto.getPassword()).build();
	}
}
