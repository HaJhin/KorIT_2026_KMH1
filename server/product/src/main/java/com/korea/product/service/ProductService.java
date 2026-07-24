package com.korea.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.product.dao.ProductDAO;
import com.korea.product.vo.ProductVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
	private final ProductDAO productDao;

	public List<ProductVO> findAll() {
		return productDao.findAll();
	}

	public List<ProductVO> createProduct(ProductVO vo) {
		productDao.createProduct(vo);
		return productDao.findAll();
	}

	public ProductVO findById(int id) {
		return productDao.findById(id);
	}
	
	public List<ProductVO> update(ProductVO vo) {
		// 제품이 있는지 확인
		ProductVO product = productDao.findById(vo.getProductId());
		if(product == null) {
			throw new IllegalArgumentException("수정할 상품이 존재하지 않습니다.");
		}
		productDao.update(vo);
		return productDao.findAll();
	}
}
