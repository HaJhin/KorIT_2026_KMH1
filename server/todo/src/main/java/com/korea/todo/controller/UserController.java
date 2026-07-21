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
import com.korea.todo.security.TokenProvider;
import com.korea.todo.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class UserController {
	
	private final UserService userService;
	private final TokenProvider tokenProvider;
	
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
	
	// @RequestBody
	// HTTP 요청의 Body에 담아 보낸 데이터를 Java객체로 변환하여
	// 컨트롤러의 매개변수로 받기 위한 오너테이션
	// POST, PUT 요청으로 JSON 데이터를 받을때 많이 사용한다.
	
	// 로그인하기
	// 경로 POST /signin
	// 메서드명 authenticate
	// 입력받은 아이디와 비밀번호를 받아서 검증하고 조회된 유저를 반환 
	@PostMapping("/signin")
	public ResponseEntity<?> authenticate(@RequestBody UserDTO dto) {
		UserEntity user = userService.getByCredentials(dto.getUserName(),dto.getPassword());
		
		// 유저가 존재한다면
		if (user != null) {
			// === 토큰 추가 === //
			final String token = tokenProvider.create(user);
			
			final UserDTO responseUserDTO = UserDTO.builder()
								.id(user.getId())
								.userName(user.getUserName())
								// === 토큰 추가 === //
								.token(token)
								.build();
			return ResponseEntity.ok().body(responseUserDTO);
		} else {
			// 유저가 없거나 인증 실패시 에러메시지를 포함한 ResponseDTO 반환
			ResponseDTO responseDTO = ResponseDTO.builder()
					.error("Login failed")
					.build();
			return ResponseEntity.ok().body(responseDTO);
		}
	} // authenticate ed
}
