package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<UserInfo> userList = new ArrayList<UserInfo>();
	
		outer : while (userList.size() < 3) {
			System.out.print("아이디 입력 : ");
			String id = sc.next();
			
			for (int i = 0; i < userList.size(); i++) {
				if (id.equals(userList.get(i).getId())) {
					System.out.println("중복된 아이디입니다.");
					continue outer;
				}
			}
			
			System.out.print("비밀번호 입력 : ");
			String password  = sc.next();
			
			userList.add(new UserInfo(id, password));
			
			for(UserInfo user : userList) {
				System.out.println(user.getId());
				System.out.println(user.getPassword());
				System.out.println("---------------");
			}
		}
		System.out.println("입력 종료.");
	}
}
