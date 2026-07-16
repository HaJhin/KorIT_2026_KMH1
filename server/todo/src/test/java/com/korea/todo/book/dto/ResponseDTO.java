package com.korea.todo.book.dto;

import java.util.List;

public class ResponseDTO<T> {
	private String error;
	private List<T> data;
}
