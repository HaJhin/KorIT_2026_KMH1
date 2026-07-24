package com.korea.product.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.korea.product.vo.OrdersVO;

@Mapper
public interface OrdersDAO {
	int createOrders(OrdersVO vo);

	List<OrdersVO> findAll();

	int decreaseStock(int productId, int orderCount);
	
}
