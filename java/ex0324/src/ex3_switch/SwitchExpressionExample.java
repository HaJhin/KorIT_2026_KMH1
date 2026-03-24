package ex3_switch;

import java.util.Scanner;

public class SwitchExpressionExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 2;
		// break를 빼먹으면 fall-through가 발생한다.
		// 값을 변수에 넣으면 중복코드가 많아진다.
		// 여러 case를 묶기가 불편하다.
		 String result = switch(num) {	
		 case 1 -> "A";
		 case 2 -> "B";
		 case 3 -> "C";
		 default -> "F";
		 };
		 
		 // 정수형 변수를 하나 만들고 해당 달이 며칠까지 있는지 Switch문으로 작성
		 int month = 3;
		 String result3 = switch (month) {	
		 case 1,3,5,7,8,10,12->month+"월은 31일까지 있습니다.";
		 case 4,6,9,11->month+"월은 30일까지 있습니다.";
		 case 2->month+"월은 28일까지 있습니다.";
		 default -> "다시 입력해주십시오.";
		 };
		 System.out.println(result3);
		 
		 int a = sc.nextInt(); 
		 int b = sc.nextInt();
		 String op = sc.next();
		 String result4 = switch (op) {
		 case ("+") -> String.valueOf(a+b);
		 case ("-") -> String.valueOf(a-b);
		 case ("*") -> String.valueOf(a*b);
		 case ("/") -> String.valueOf(a/b);
		 default -> "Error";
		 };
		 System.out.printf("%d %s %d = %s",a,op,b,result4);
	}
}
