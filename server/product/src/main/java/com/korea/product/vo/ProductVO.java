package com.korea.product.vo;

import java.security.Timestamp;
import java.time.LocalDate;

import lombok.Data;

@Data
public class ProductVO {
	private int productId;
	private String productName;
	private int productStock;
	private int productPrice;
	private LocalDate registerDate;
	private LocalDate updateDate;
}
