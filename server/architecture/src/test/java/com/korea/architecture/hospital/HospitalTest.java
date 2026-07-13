package com.korea.architecture.hospital;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class HospitalTest {
	
	@Autowired
	private Hospital hospital;
	
	@Test
	public void hospitalTest() {
		log.info("병원 의존성 주입 테스트 시작");
	
		hospital.startmedicalService();
		
		log.info("테스트 종료");
	}
}
