package com.korea.todo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.todo.dto.ResponseDTO;
import com.korea.todo.dto.ResponseUserDTO;
import com.korea.todo.dto.UserDTO;
import com.korea.todo.entity.UserEntity;
import com.korea.todo.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class UserController {
	private final UserService userService;
	
	// 회원가입
	// 경로 : /signup
	// 메서드 : 
	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@RequestBody UserDTO dto) {
		try {
			UserEntity user = UserEntity.builder()
					.userName(dto.getUserName()).password(dto.getPassword()).build();
			
			UserEntity registerdUser = userService.create(user);
			
			UserDTO responseUserDTO = UserDTO.builder()
											.id(registerdUser.getId())
											.userName(registerdUser.getUserName())
											.build();
			return ResponseEntity.ok(responseUserDTO);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	// 로그인하기
	// 경로 POST /signin
	// 메서드명 authenticate
	// 입력받은 아이디와 비밀번호를 받아서 검증하고 조회된 유저를 반환 
}
