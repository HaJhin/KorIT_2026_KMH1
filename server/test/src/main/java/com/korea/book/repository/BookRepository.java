package com.korea.book.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.korea.book.dto.BookDTO;
import com.korea.book.entity.BookEntity;

// Jpa 상속받으면 Repository로 취급함
@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {
	
	// 특정 제목이 포함된 데이터를 조회하는 메서드
	public List<BookEntity> findByTitleContaining(String title);
	
	// 특정 카테고리의 데이터 조회 메서드
	public List<BookEntity> findByCategoryContaining(String category);
}
