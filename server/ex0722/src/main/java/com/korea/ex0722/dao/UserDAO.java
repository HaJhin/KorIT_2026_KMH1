package com.korea.ex0722.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.korea.ex0722.vo.UserVO;

@Mapper // MyBatis가 해당 인터페이스를 Mapper로 인식하고 Spring에서 주입할 수 있게 해준다.
public interface UserDAO {
	List<UserVO> findAll();
	
	UserVO findById(Long id);

	int insert(UserVO user);
	
	int update(UserVO user);
	
	int delete(Long id);
}
