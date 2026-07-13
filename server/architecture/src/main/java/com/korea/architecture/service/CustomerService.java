package com.korea.architecture.service;

import org.springframework.stereotype.Component;

@Component
public class CustomerService {
	
	public void checkCustomer() {
		System.out.println("고객의 정보를 확인합니다.");
	}
}
