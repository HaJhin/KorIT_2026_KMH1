package case1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Member> memberList = new ArrayList<Member>();
		
		memberList.add(new Member("aaa", "홍길동", 10));
		memberList.add(new Member("bbb", "임꺽정", 20));
		memberList.add(new Member("ccc", "장길산", 30));
		
		System.out.println("=== 전체 회원 ===");
		for (Member m : memberList) {
			m.printInfo();
		}
		
		int adultCount = 0;
		for (Member m : memberList) {
			if (m.age >= 20) adultCount++;
		}
		System.out.println("20살 이상인 회원의 수 : "+adultCount);
	}
}
