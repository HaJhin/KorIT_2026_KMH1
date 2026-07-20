package com.korea.todo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.todo.dto.ResponseDTO;
import com.korea.todo.dto.TodoDTO;
import com.korea.todo.entity.TodoEntity;
import com.korea.todo.service.TodoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/todo")
@RequiredArgsConstructor
public class TodoController {
	// TodoService를 필드로 갖고 객체를 생성자 주입을 한다.
	// /test로 요청이 들어오면 testTodo라는 메서드가 실행되고
	// 서비스의 메서드를 실행해 응답을 반환
	private final TodoService todoService;

//	@GetMapping("/test")
//	public String testTodo() {
//		return todoService.testService();
//	}

	// /test로 요청이 들어오면 testTodo라는 메서드가 실행되고
	// 서비스의 메서드를 실행하여 응답으로 반환한다.
	// ResponseEntity : HTTP 응답 전체를 표현하는 객체
	@GetMapping("/test")
	public ResponseEntity<?> testTodo() {
		String str = todoService.testService();
		List<String> list = new ArrayList<String>();
		list.add(str);
		ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
		// ok() -> 상태를 강제로 200으로 설정한다.
		// body() -> 응답 본문에 response 객체를 넣는다.
		// 완성된 HTTP 응답을 클라이언트에게 전송한다.
		return ResponseEntity.ok().body(response);
		// Controller -> Service -> ResponseDTO -> ResponseEntity -> JSON
	} // testTodo ed

	// 요청 -> (DTO -> Entity) TodoController -> TodoService
	@PostMapping
	public ResponseEntity<?> createTodo(@RequestBody TodoDTO dto) {
		try {
			// 추가하기 위해 데이터가 넘어온다
			// 매개변수로 받아 엔티티로 변경하고 서비스로 보낸다.
			// 비즈니스 로직을 실행하고 난 결과를 받아와 응답으로 내보낸다.
			String temporaryUserId = "temporary-User"; // 임시 유저
			TodoEntity entity = TodoDTO.toEntity(dto);
			entity.setUserId(temporaryUserId);
			List<TodoEntity> result = todoService.create(entity);

			List<TodoDTO> dtos = result.stream().map(TodoDTO::new).toList();

			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();

			return ResponseEntity.ok().body(response);
		} catch (Exception e) {
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().error(e.getMessage()).build();
			return ResponseEntity.badRequest().body(response);
		}
	} // createTodo ed

	@GetMapping("/findAll")
	public ResponseEntity<?> findAll() {
		try {
			String temporaryUserId = "temporary-User"; // 임시 유저
			List<TodoEntity> result = todoService.findAll(temporaryUserId);
			List<TodoDTO> dtos = result.stream().map(TodoDTO::new).toList();
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
			return ResponseEntity.ok().body(response);
		} catch (Exception e) {
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().error(e.getMessage()).build();
			return ResponseEntity.badRequest().body(response);
		}
	} // findAll ed

	@PutMapping("/update")
	public ResponseEntity<?> updateTodo(@RequestBody TodoDTO dto) {
		try {
			String temporaryUserId = "temporary-User"; // 임시 유저
			TodoEntity entity = TodoDTO.toEntity(dto);
			entity.setUserId(temporaryUserId);
			List<TodoEntity> result = todoService.updateTodo(entity);

			List<TodoDTO> dtos = result.stream().map(TodoDTO::new).toList();

			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();

			return ResponseEntity.ok().body(response);
		} catch (Exception e) {
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().error(e.getMessage()).build();
			return ResponseEntity.badRequest().body(response);
		}
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteTodo(@RequestBody TodoDTO dto) {
		try {
			String temporaryUserId = "temporary-User"; // 임시 유저
			TodoEntity entity = TodoDTO.toEntity(dto);
			entity.setUserId(temporaryUserId);
			List<TodoEntity> result = todoService.deleteTodo(entity);

			List<TodoDTO> dtos = result.stream().map(TodoDTO::new).toList();

			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();

			return ResponseEntity.ok().body(response);
		} catch (Exception e) {
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().error(e.getMessage()).build();
			return ResponseEntity.badRequest().body(response);
		}
	}
}
