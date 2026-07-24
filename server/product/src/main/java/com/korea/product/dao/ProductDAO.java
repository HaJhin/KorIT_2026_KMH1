package com.korea.product.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.korea.product.vo.ProductVO;

@Mapper
public interface ProductDAO {
	// 전체 조회
	List<ProductVO> findAll();
	
	// 특정 상품 단건 조회(id)
	ProductVO findById(int i);
	
	// 상품 등록
	int createProduct(ProductVO vo);

	int update(ProductVO vo);
}
