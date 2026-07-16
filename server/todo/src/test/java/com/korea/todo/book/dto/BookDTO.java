package com.korea.todo.book.dto;

import com.korea.todo.book.entity.BookEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookDTO {
	private Long id;
	private String title;
	private String author;
	private int price;
	private String category;
	private int stock;
	
	public static BookDTO toDTO(BookEntity entity) {
        if (entity == null) return null;
        
        return BookDTO.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .author(entity.getAuthor())
                .price(entity.getPrice())
                .category(entity.getCategory())
                .stock(entity.getStock())
                .build();
    }
}
