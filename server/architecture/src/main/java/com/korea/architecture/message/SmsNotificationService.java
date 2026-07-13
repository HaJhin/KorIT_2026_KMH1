package com.korea.architecture.message;

import org.springframework.stereotype.Component;

@Component
public class SmsNotificationService implements NotificationService {

	@Override
	public void send(String message) {
		System.out.println("문자 메시지 알림 전송 : " + message);
	}
	
}
