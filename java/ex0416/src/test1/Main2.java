package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		File f = new File("users.txt");
		
		while (true) {
			System.out.println("1. 회원가입 / 2. 로그인 / 3. 종료");
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			
			if (choice == 1) {
				System.out.println("=== 회원가입 ===");
				System.out.print("아이디 입력 : ");
				String reId = sc.next();
				System.out.print("비밀번호 입력 : ");
				String rePassword = sc.next();
				
				User user = new User(reId, rePassword);
				FileOutputStream fos = new FileOutputStream(f,true);
				fos.write(user.byteData());
			} // if ed
			
			if (choice == 2) {
				System.out.println("=== 로그인 ===");
				System.out.print("아이디 입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String password = sc.next();
				
				if (!f.exists()) {
					System.out.println("가입된 회원이 없음");
					continue;
				}
				
				// 파일 전체 읽기
				FileInputStream fis = new FileInputStream(f);
				byte[] buffer = new byte[(int)f.length()];
				fis.read(buffer);
				fis.close();
				
				String allUsersData = new String(buffer);
				String[] lines = allUsersData.split("\n");
				boolean loginSuccess = false;
				
				for(String line : lines) {
					if(line.isEmpty()) continue;
					String[] parts = line.split(":");
					if(parts[0].equals(id)&&parts[1].equals(password)) {
						loginSuccess = true;
						break;
					}
				}
				
				if(loginSuccess) System.out.println("로그인 성공");
				else System.out.println("로그인 실패");
			} // 로그인 종료
			
			if (choice==3) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	} // main ed
}
