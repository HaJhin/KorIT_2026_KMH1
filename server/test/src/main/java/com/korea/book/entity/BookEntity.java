package com.korea.book.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="book")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BookEntity {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String title;
	@Column(nullable = false)
	private String author;
	@Column(nullable = false)
	private int price;
	@Column(nullable = false)
	private String category;
	@Column(nullable = false)
	private int stock;
}
