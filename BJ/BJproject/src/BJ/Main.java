package BJ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		if (h < 0 || h > 23) return;
		int m = sc.nextInt();
		if (m < 0 || m > 59) return;
		int finish = sc.nextInt();
		if (finish < 0 || finish > 24) return;
		System.out.println(h + m + finish);
	}
}
