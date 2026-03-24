package ex3_switch;

public class NoBreakExample {
	public static void main(String[] args) {
		int time = 8;
		
		switch(time) {	
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의합니다.");
		case 10:
			System.out.println("업무봅니다.");
		default:
			System.out.println("외근합니다.");
		}
	}
}
