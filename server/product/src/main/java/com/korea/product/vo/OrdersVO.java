package com.korea.product.vo;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class OrdersVO {
	private int orderId;
	private int productId;
	private String productName;
	private int orderCount;
	private int productPrice;
	private int totalPrice;
	private LocalDateTime orderDate;
}
