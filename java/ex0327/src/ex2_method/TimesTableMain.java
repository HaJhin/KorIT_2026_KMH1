package ex2_method;

import java.util.Scanner;

public class TimesTableMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TimesTable tt = new TimesTable();
		System.out.print("정수 입력 : ");
		int x = sc.nextInt();
		tt.showTable(x);
	}
}
