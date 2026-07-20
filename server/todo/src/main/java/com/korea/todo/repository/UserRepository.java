package com.korea.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.korea.todo.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {
	UserEntity findByUserName(String userName);
	Boolean existsByUserName(String userName);
	UserEntity findByUserNameAndPassword(String userName, String password);
	
}
