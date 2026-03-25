package ex6_String;

import java.util.Scanner;

public class StringExample2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	// 문자열을 입력받고 그 문자열을 뒤집어서 원본과 같으면
	// "같습니다." 다르면 "다릅니다" 출력
	/*
	System.out.print("원본 : ");
	String original = sc.nextLine();
	String reverse = "";
	String[] arr = original.split("");
	for (int i = original.length()-1; i >= 0; i--) {
		reverse += arr[i].toString();
		System.out.println(reverse);
		} // for ed
	if (reverse.equals(original)) System.out.println("같습니다.");
	else System.out.println("다릅니다.");
	*/
	
	System.out.print("원본 : ");
	String original = sc.nextLine();
	String reverse = "";
	for (int i = original.length()-1; i>=0; i--) {
			reverse += original.charAt(i);
			System.out.println(reverse);
		} // for ed
	if (reverse.equals(original)) System.out.println("같습니다.");
	else System.out.println("다릅니다.");
	} // main ed
} // class ed
