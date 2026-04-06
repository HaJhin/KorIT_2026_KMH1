package ex5_Math;

import java.util.Arrays;
import java.util.Scanner;

public class RandomExample {
	public static void main(String[] args) {
		// 로또번호(1~45)를 뽑아서 배열에 넣는다.
		int[] num = new int[6];
		int count = 0;
		Outer : while (count < 6) {
			int rNum = (int)((Math.random()*45)+1);
			for (int i = 0; i < num.length; i++) {
				if (rNum == num[i]) continue Outer;
			}
			num[count] = rNum;
			count++;
		}
		System.out.println(Arrays.toString(num));
		// 키보드에서 6개의 순자를 입력받아 번호 맞추기
		Scanner sc = new Scanner(System.in);
		int[] user = new int[6];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
	}
}
