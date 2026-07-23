package com.korea.ex0723.dao;

import java.awt.print.Book;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.korea.ex0723.vo.BookVO;

@Mapper
public interface BookDAO {
	 
	List<BookVO> fintAll();
	
	// 단건 조회
	BookVO findById(Long id);
	
	// 카테고리로 조회
	List<BookVO> findByCategory(String name);
	
	int insert(BookVO vo);
	
	int update(BookVO vo);

	int delete(Long id);

	List<BookVO> findByTitle(String title);

	int count();

	List<BookVO> findAllOrder(String sort);

	
}
