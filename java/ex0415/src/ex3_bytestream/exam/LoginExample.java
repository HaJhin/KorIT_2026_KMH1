package ex3_bytestream.exam;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class LoginExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String memberId = "";
		String memberPw = "";
		
		File file = new File("member.txt");
		byte[] files = new byte[(int)file.length()];
		
		try {
			FileInputStream fis = new FileInputStream("member.txt");
			fis.read(files);
			String str = new String(files);
			String[] member = str.split("\r\n");
			memberId = member[0];
			memberPw = member[1];
		} catch (Exception e) {
			e.printStackTrace();
		} // ed
		
		String id = sc.next();
		String pw = sc.next();
		
		if (id.equals(memberId) && pw.equals(memberPw)) {
			System.out.println("로그인 성공");
		} else System.out.println("없는 아이디 또는 틀린 비밀번호 입니다.");
		
	}
}
