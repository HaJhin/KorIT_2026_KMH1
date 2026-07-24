package com.korea.product.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.product.dao.ProductDAO;
import com.korea.product.service.ProductService;
import com.korea.product.vo.ProductVO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
	private final ProductService productService;
	
	@GetMapping
	public List<ProductVO> findAll() {
		return productService.findAll();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<?> findById(@PathVariable int id) {
		ProductVO product = productService.findById(id);
		return ResponseEntity.ok(product);
	}
	
	@PostMapping
	public ResponseEntity<?> createProduct(@RequestBody ProductVO vo) {
		if(vo.getProductName() == null) return ResponseEntity.badRequest().body("상품 이름을 입력하세요");
		if(vo.getProductStock() < 0) return ResponseEntity.badRequest().body("상품 재고는 0 이상이어야 합니다.");
		if(vo.getProductPrice() < 0) return ResponseEntity.badRequest().body("상품 가격은 0 이상이어야 합니다.");
		List<ProductVO> result = productService.createProduct(vo);
		return ResponseEntity.ok(result);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<?> update(@PathVariable int id,@RequestBody ProductVO vo) {
		List<ProductVO> result = productService.createProduct(vo);
		return ResponseEntity.ok(result);
	}
}
