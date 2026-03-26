package ex1_array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		char[] cards = {'1','L','O','2','V','3','E'};
		String myWord = "";
		
		// 배열에서 문자만 뽑아 단어 만들기
		// 아스키 코드 활용
		for (int i = 0; i < cards.length; i++) {
			if ((int)cards[i] >= 65 && (int)cards[i] <= 90) {
				myWord += cards[i];
			} // if ed
		} // for ed
		// System.out.println(myWord);
		
		// 변수 money에 10~5000 사이의 난수 발생
		// 1의 자리 숫자는 반드시 0
		int[] coin = {500,100,50,10};
		int money = (int)(Math.random()*500-1)*10;
		int[] needCoin = {0,0,0,0};
		//System.out.println("금액 : " + money);
		for (int i = 0; i < coin.length; i++) {
			needCoin[i] = money/coin[i];
			money = money%coin[i];
			// System.out.printf("%d원 동전 : %d\n",coin[i],needCoin[i]);
		}
		
		// 키보드에서 배열의 길이를 입력 받는다.
		// 입력받은 배열의 길이만큼 알파벳을 요소로 넣고
		// 배열의 모든 요소를 출력
		// 배열의 길이 : 5
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int arrNum = sc.nextInt();
		char[] arr = new char[arrNum];
		for (int i = 0; i < arr.length; i++) {
			if (i+65 <= 90) { 
				char word = (char)(i+65);
				arr[i] = word;
				System.out.print(arr[i]);
			} else System.out.println("알파벳 범위 초과."); 
		} // for ed */
		
		// 로또 번호 구하기
		// 1~45의 난수를 발생시켜 로또번호 6자리 구하기
		int[] lotto = new int[6];
		outer:for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45-1); // 랜덤 난수 지정
			 for (int j = 0; j < i; j++) {
				 continue outer; // outer로 돌아가 다시 시작
			 }
			 System.out.println("번호 : "+lotto[i]);
		}
		System.out.println(Arrays.toString(lotto));
	} // main ed
} // class ed
