package BJ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		
		int m = sc.nextInt();
		
		int ct = sc.nextInt();
		
		int fh = h; int fm = m+ct; 
		fh += fm/60; 
		fm %= 60;
		fh %= 24;
		System.out.printf("%d %d",fh,fm);
	}
}
