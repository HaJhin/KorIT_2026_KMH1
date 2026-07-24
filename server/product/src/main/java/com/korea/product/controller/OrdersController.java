package com.korea.product.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.product.service.OrdersService;
import com.korea.product.vo.OrdersVO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrdersController {
	private final OrdersService ordersService;
	
	@GetMapping
	public List<OrdersVO> findAll() {
		return ordersService.findAll();
	}
	
	@PostMapping
	public ResponseEntity<?> createOrders(@RequestBody OrdersVO vo) {
		try {
			return ResponseEntity.ok().body(ordersService.createOrders(vo));
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
}
