package service;
import member.*;
public class MemberService {
	void register(Member member) {
		System.out.println("회원 등록을 시작합니다.");
		System.out.println("회원 이름 : " + member.getName());
		System.out.println("회원 나이 : ");
	}
}
