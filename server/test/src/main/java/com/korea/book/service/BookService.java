package com.korea.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.korea.book.dto.BookDTO;
import com.korea.book.entity.BookEntity;
import com.korea.book.repository.BookRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService {
	private final BookRepository bookRepository;

	// 책 추가
	public BookDTO addBooks(BookDTO book) {
		BookEntity bookEntity = BookEntity.builder().title(book.getTitle()).author(book.getAuthor())
				.price(book.getPrice()).category(book.getCategory()).stock(book.getStock()).build();

		BookEntity savedEntity = bookRepository.save(bookEntity);

		return new BookDTO(savedEntity);
	} // addBooks ed

	// 책 전체 조회
	public List<BookDTO> findAll() {
		List<BookEntity> list = bookRepository.findAll();

		return list.stream().map(entity -> BookDTO.builder().id(entity.getId()).title(entity.getTitle())
				.author(entity.getAuthor()).price(entity.getPrice()).build()).toList();
	} // findAll ed

	// id에 맞는 도서 조회
	public BookDTO findById(long id) {
		BookEntity bookEntity = bookRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("존재하지 않는 도서입니다."));
		return new BookDTO(bookEntity);
	}

	// 제목이 맞는 도서 조회
	public List<BookDTO> findByTitle(String title) {
		List<BookEntity> list = bookRepository.findByTitleContaining(title);

		return list.stream().map(BookDTO::new).toList();
	}

	// 카테고리가 맞는 도서 조회
	public List<BookDTO> findByCategory(String category) {
		List<BookEntity> list = bookRepository.findByCategoryContaining(category);

		return list.stream().map(BookDTO::new).toList();
	}
	
	// id가 일치한 도서 수정
	public BookDTO updateBook(Long id, BookDTO dto) {
		// id를 통해서 꺼내온 원본
		BookEntity entity = bookRepository.findById(id).get();
		
		// dto 수정할 값을 entity에 넣는다.
		entity.setTitle(dto.getTitle());
		entity.setAuthor(dto.getAuthor());
		entity.setPrice(dto.getPrice());
		entity.setCategory(dto.getCategory());
		entity.setStock(dto.getStock());
		
		BookEntity savedEntity = bookRepository.save(entity);
		
		return new BookDTO(savedEntity);
	}
	
	// id가 일치한 도서 삭제
	public void deleteBook(Long id) {
		BookEntity entity = bookRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("존재하지 않는 도서입니다."));
		bookRepository.delete(entity);
	}
}
