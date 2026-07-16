package com.korea.book.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.korea.book.dto.BookDTO;
import com.korea.book.dto.ResponseDTO;
import com.korea.book.entity.BookEntity;
import com.korea.book.service.BookService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("books")
public class BookController {
	
	private final BookService bookService;
	
	@PostMapping
	public ResponseEntity<?> addBooks(@RequestBody BookDTO book) {
		try {
			BookDTO result = bookService.addBooks(book);
			
			ResponseDTO<BookDTO> response =
					ResponseDTO.<BookDTO>builder()
						.data(List.of(result)).build();
			
			return ResponseEntity.ok().body(response);
		} catch (Exception e) { 
			ResponseDTO<BookDTO> response =
					ResponseDTO.<BookDTO>builder()
						.error(e.getMessage()).build();
			return ResponseEntity.badRequest().body(response);
		} // try catch ed
	} // addBooks ed
	
	// 전체도서 조회 GET : findAll
	@GetMapping
	public ResponseEntity<?> findAll() {
		try {
			List<BookDTO> result = bookService.findAll();
			
			ResponseDTO<BookDTO> response =
					ResponseDTO.<BookDTO>builder()
						.data(result).build();
			return ResponseEntity.ok().body(response);
		} catch (Exception e) {
			ResponseDTO<BookDTO> response =
					ResponseDTO.<BookDTO>builder()
						.error(e.getMessage()).build();
			return ResponseEntity.badRequest().body(response);
		}
	} // findAll ed
	
	// ID로 도서 조회 GET
	// 경로 GET /books/{id}
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") long id) {
		try {
			BookDTO result = bookService.findById(id);
			
			ResponseDTO<BookDTO> response =
					ResponseDTO.<BookDTO>builder()
						.data(List.of(result)).build();
			return ResponseEntity.ok().body(response);
		} catch (Exception e) {
			ResponseDTO<BookDTO> response =
					ResponseDTO.<BookDTO>builder()
						.error(e.getMessage()).build();
			return ResponseEntity.badRequest().body(response);
		}
	} // findById
 	
	// 제목(title)을 통한 조회
	@GetMapping("/search")
	public ResponseEntity<?> findByTitle(@RequestParam("title") String title) {
		try {
			List<BookDTO> result = bookService.findByTitle(title);
			
			ResponseDTO<BookDTO> response =
					ResponseDTO.<BookDTO>builder()
						.data(result).build();
			return ResponseEntity.ok().body(response);
		} catch (Exception e) {
			ResponseDTO<BookDTO> response =
					ResponseDTO.<BookDTO>builder()
						.error(e.getMessage()).build();
			return ResponseEntity.badRequest().body(response);
		}
	}
	
	// 카테고리를 통한 조회
	@GetMapping("/search")
	public ResponseEntity<?> findByCategory(@RequestParam("category") String category) {
		try {
			List<BookDTO> result = bookService.findByCategory(category);
			
			ResponseDTO<BookDTO> response =
					ResponseDTO.<BookDTO>builder()
						.data(result).build();
			return ResponseEntity.ok().body(response);
		} catch (Exception e) {
			ResponseDTO<BookDTO> response =
					ResponseDTO.<BookDTO>builder()
						.error(e.getMessage()).build();
			return ResponseEntity.badRequest().body(response);
		}
	} // 
	
	// 목록 수정
	@PutMapping("{id}")
	public ResponseEntity<?> updateBook(
			@PathVariable Long id,
			@RequestBody BookDTO dto) {
		try {
			BookDTO result = bookService.updateBook(id,dto);
			
			ResponseDTO<BookDTO> response =
					ResponseDTO.<BookDTO>builder()
						.data(List.of(result)).build();
			return ResponseEntity.ok().body(response);
		} catch (Exception e) {
			ResponseDTO<BookDTO> response =
					ResponseDTO.<BookDTO>builder()
						.error(e.getMessage()).build();
			return ResponseEntity.badRequest().body(response);
		}
	} // updateBook ed
	
	@DeleteMapping
	public ResponseEntity<?> deleteBook(@RequestParam("id") long id) {
		try {
			bookService.deleteBook(id);
			
			ResponseDTO<String> response =
					ResponseDTO.<String>builder()
						.data(List.of("도서 삭제 완료")).build();
			return ResponseEntity.ok().body(response);
		} catch (Exception e) {
			ResponseDTO<String> response =
					ResponseDTO.<String>builder()
						.error(e.getMessage()).build();
			return ResponseEntity.badRequest().body(response);
		}
	} // deleteBook ed
}
