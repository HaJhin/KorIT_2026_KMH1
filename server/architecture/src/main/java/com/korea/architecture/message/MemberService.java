package com.korea.architecture.message;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MemberService {
	private final NotificationService notificationService;
	
	
	public MemberService(@Qualifier("smsNotificationService") NotificationService notificationService) {
		this.notificationService = notificationService;
	} // ctor ed
	
	public void joinMember(String memberName) {
		System.out.println(memberName + " 회원을 등록합니다.");
		notificationService.send("회원가입을 축하합니다.");
		System.out.println("회원가입을 축하합니다.");
	}
}
