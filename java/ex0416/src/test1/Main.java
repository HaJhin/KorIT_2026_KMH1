package test1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		byte[] buffer = new byte[1024];
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 회원가입 ===");
		System.out.print("아이디 입력 : ");
		String reId = sc.next();
		System.out.print("비밀번호 입력 : ");
		String rePassword = sc.next();
		
		User user = new User(reId, rePassword);
		
		try(FileOutputStream fos = new FileOutputStream("users.txt")) {
			fos.write(user.byteData());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("저장 성공");
		
		System.out.println("=== 로그인 ===");
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		System.out.print("비밀번호 입력 : ");
		String password = sc.next();
		
		String loginData = new String().format("%s:%s",id,password);
		loginData.trim();
		String userData = "";
		
		try(FileInputStream fis = new FileInputStream("users.txt")) {
			int data = 0;
			while ((data = fis.read())!=-1) {
				userData += (char)data;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(loginData);
		System.out.println(userData);
		
		if (loginData.equals(userData)) {
			System.out.println("로그인 성공");
		} else System.out.println("로그인 실패");
	}
}
