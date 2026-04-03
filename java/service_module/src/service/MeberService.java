package service;

import member.*;

public class MeberService {
	
	public void register(Member member) {
		System.out.println("회원 등록을 시작합니다.");
		System.out.println("회원 이름 : " + member.getName());
		member .setName(member.getName());
		System.out.println("회원 나이 : " + member.getAge());
		member.setAge(member.getAge());
		System.out.println("회원 등록 완료");
		System.out.println("----------------------");
	} // register ed
	
	public void checkAdult(Member member) {
		System.out.println("[회원 나이 체크]");
		System.out.println("회원 이름 : " + member.getName());
		if (member.getAge() >= 20) {
			System.out.println("성인입니다.");
		} else { System.out.println("미성년자입니다."); } 
	} // checkAdult ed
}
