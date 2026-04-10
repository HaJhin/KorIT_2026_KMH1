package exam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Example2 {
	// 학생 이름을 입력받아 List에 저장한다.
	// 이미 존재하는 이름이면 추가하지 않고 "이미 존재하는 이름입니다." 출력
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<String> set = new HashSet<String>();
		
		while(true) {
			System.out.print("문자열 입력 : ");
			String str = sc.next();
			if (str.equalsIgnoreCase("exit")) {
				System.out.println("입력 종료");
				break;
			}
			if (!set.add(str)) {
				System.out.println("이미 존재하는 이름입니다.");
			} 
		} // while ed
		
		List<String> list = new ArrayList<String>(set);
		System.out.println(list);
	}		
}
