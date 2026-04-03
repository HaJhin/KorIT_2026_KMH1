package service;

import member.*;

public class MeberService {
	
	public void register(Member member) {
		System.out.println("회원 등록을 시작합니다.");
		System.out.println("회원 이름 : " + member.getName());
		member.setName(member.getName());
		System.out.println("회원 나이 : " + member.getAge());
		member.setAge(member.getAge());
		System.out.println("회원 등록 완료");
	}
}
