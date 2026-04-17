package test.case1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Member> memberList = new ArrayList<Member>();
		memberList.add(new Member("aaa", "홍길동", 20));
		memberList.add(new Member("bbb", "임꺽정", 30));
		memberList.add(new Member("ccc", "장길산", 40));
		
		for (Member member : memberList) {
			member.printInfo();
		}
	}
}
