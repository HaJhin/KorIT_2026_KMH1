package com.korea.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.product.dao.OrdersDAO;
import com.korea.product.dao.ProductDAO;
import com.korea.product.vo.OrdersVO;
import com.korea.product.vo.ProductVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrdersService {
	private final OrdersDAO ordersDAO;
	private final ProductDAO productDAO;

	public List<OrdersVO> createOrders(OrdersVO vo) {
		// 1. 주문 수량 검사
		if(vo.getOrderCount() <= 0) {
			throw new IllegalArgumentException("주문 수량은 1개 이상이어야 합니다.");
		}
		// 2. 상품 조회
		ProductVO product = productDAO.findById(vo.getProductId());
		if (product == null) throw new IllegalArgumentException("상품이 존재하지 않습니다.");
		// 3. 상품 재고 검사
		if(product.getProductStock() < vo.getOrderCount())
			throw new IllegalArgumentException("상품 재고 부족");
		
		// 4. 주문 등록
		int orderResult = ordersDAO.createOrders(vo);
		
		int stockResult = ordersDAO.decreaseStock(vo.getProductId(),vo.getOrderCount());
		
		return ordersDAO.findAll();
	}

	public List<OrdersVO> findAll() {
		return ordersDAO.findAll();
	}
	
}
