package ex3_print;

// java.util 패키지에 있는 Scanner 클래스
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
		int a = scan.nextInt();
		if (a == 1) { 
			System.out.println("루프 종료.");
			break;
		} else {
			System.out.println(a);
			System.out.println("재입력");
		} // if else ed
		}
	}
}
