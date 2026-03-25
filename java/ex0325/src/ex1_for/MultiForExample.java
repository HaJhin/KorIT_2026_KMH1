package ex1_for;

import java.util.Iterator;

public class MultiForExample {
	public static void main(String[] args) {
		// 지역변수
		// 전역변수
		// 클래스변수
		
		/* for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i+j == 6) System.out.printf("%d %d\n",i,j);
			}
		} */
		int x = 65;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				 System.out.print((char)x++ +" ");
			 }
			System.out.println();
		}
		
	} // main ed
}
