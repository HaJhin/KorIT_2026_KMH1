package exam2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<User> userList = new ArrayList<User>();
		userList.add(new User("김철수", 25, "인천"));
		userList.add(new User("이영희", 18, "서울"));
		userList.add(new User("김민수", 30, "부산"));
		userList.add(new User("박지은", 22, "서울"));
			
		UserService us = new UserService();
		
		UserFilter findAdult = us.getFilter("adult");
		UserFilter findSeoul = us.getFilter("seoul");
		UserFilter findKim = us.getFilter("kim");
		
		System.out.println("== 성인 회원 ==");
		us.FilterUsers(userList, findAdult);
		System.out.println("== 서울 거주 회원 ==");
		us.FilterUsers(userList, findSeoul);
		System.out.println("== 성이 김씨인 회원 ==");
		us.FilterUsers(userList, findKim);
		
	} // main ed
}
