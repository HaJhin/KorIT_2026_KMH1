package com.korea.todo.service;

import org.springframework.stereotype.Service;

import com.korea.todo.dto.UserDTO;
import com.korea.todo.entity.UserEntity;
import com.korea.todo.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
	private final UserRepository repository;
	
	// 회원가입 기능
	public UserEntity create(UserEntity user) {
		if(user == null || user.getUserName() == null) {
			throw new RuntimeException("Invalid arguments");
		}
		
		final String userName = user.getUserName();
		
		if (repository.existsByUserName(userName)) {
			log.warn("UserName already exists {}", userName);
			throw new RuntimeException("UserName already exists");
		}
		
		return repository.save(user);
	}

	public UserEntity getByCredentials(String userName, String password) {
		return repository.findByUserNameAndPassword(userName, password);
	} // 로그인
}
