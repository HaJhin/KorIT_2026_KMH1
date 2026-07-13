package com.korea.architecture.service;

import org.springframework.stereotype.Component;

@Component
public class ReservationService {
	
	private final CustomerService customerService;
	private final TravelProductService travelProductService;
	
	public ReservationService(CustomerService cs,TravelProductService ts) {
		this.customerService = cs;
		this.travelProductService = ts;
	}
	
	public void reserve() {
		System.out.println("여행 예약을 시작합니다.");
		customerService.checkCustomer();
		travelProductService.checkTravelProduct();
		System.out.println("여행 예약이 완료되었습니다.");
	}
}
