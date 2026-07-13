package com.korea.architecture;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.korea.architecture.service.ReservationService;

@SpringBootTest
public class CustomerService {

	@Autowired
	private ReservationService reservationService;
	
	@Test
	public void reservationTest() {
		reservationService.reserve();
	}
}
