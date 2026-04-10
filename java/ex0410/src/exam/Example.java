package exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Example {
	public static void main(String[] args) {
		// 사용자로부터 여러개의 문자열을 입력받아 List에 저장한다.
		// 이후 중복을 제거하고 정렬하여 출력
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		
		while (true) {
			System.out.print("문자열 입력 : ");
			String str = sc.next();
			if (str.equals("exit")) {
				System.out.println("- 입력 종료 -");
				break;
			} else { list.add(str); }
		} // while ed
		
		Set<String> set = new HashSet<String>(list);
		List<String> list2 = new ArrayList<String>(set);
		Collections.sort(list2);
		
		System.out.println(list2);
		
	} // main ed
} // Example
