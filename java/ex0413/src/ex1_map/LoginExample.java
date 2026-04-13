package ex1_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class LoginExample {
	public static void main(String[] args) {
		// 아이디와 비밀번호 저장 (둘다 String)
		// 아이디와 비번 입력해서 로그인 할때
		// 아이디 x = "아이디 없삼" , 비밀번호 미일치 "비밀번호 오류"
		// 다 맞으면 로그인 성공
		Map<String, String> users = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		String currentId;
		
		users.put("admin", "1234");
		users.put("user1", "abcd");
		users.put("guest", "1111");
		
		while(true) {
			System.out.print("아이디 입력 : ");
			String id = sc.next();
			
			if (users.containsKey(id)) {
				currentId = id;
				break;
			} else {
				System.out.println("존재하지 않는 아이디입니다.");
				continue;
			}
		}	
		
		while (true) {
			System.out.print("비밀번호 입력 : ");
			String password = sc.next();
			
			if (password.equals(users.get(currentId))) {
				System.out.println("로그인 성공");
				break;
			} else {
				System.out.println("비밀번호 미일치");
				continue;
			}
		}
	} // main ed
}
