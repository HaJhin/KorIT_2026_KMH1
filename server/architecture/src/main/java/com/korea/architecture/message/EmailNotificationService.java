package com.korea.architecture.message;

import org.springframework.stereotype.Component;

@Component
public class EmailNotificationService implements NotificationService {

	@Override
	public void send(String message) {
		System.out.println("이메일 알림 전송 : " + message);
	}
	
}
