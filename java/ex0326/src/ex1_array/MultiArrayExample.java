package ex1_array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArrayExample {
	public static void main(String[] args) {
		// 2차원 배열 : 1차원 배열을 요소로 갖는 배열
		
		// 2차원 배열의 초기화
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		// 2차원 배열의 선언과 생성
		// 1차원 배열과 마찬가지로 길이를 지정해줘야 한다.
		int [][] ar = new int[3][5];
		
		// 배열의 각 공간에 접근하는 방법
		// 배열명[요소의 index][1차원 배열의 index
		//   System.out.println(arr[1][1]);
		
		// 지역변수
		// 전역변수
		// 클래스변수
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				//System.out.print(arr[i][j]);
			}
		}
		
		// 각 1차원 배열에 들어가는 데이터의 개수가 다른 경우
		
		// 2차원 배열에 들어가는 요소의 개수만 일단 지정한다.
		int[][] iAr = new int[3][];
		
		// 각 1차원 배열에 들어가는 데이터의 개수를 따로 지정할 수 있다. 
		iAr[0] = new int[1];
		iAr[1] = new int[2];
		iAr[2] = new int[3];
		
		iAr[0][0] = 100;
		iAr[1][0] = 200;
		iAr[1][1] = 300;
		iAr[2][0] = 400;
		iAr[2][1] = 500;
		iAr[2][2] = 600;
		
		// 2차원 배열 모든 요소의 총합 구하기
		int[][] num = {{1},{2,3},{4,5,6},{7,8,9,10}};
		int totalNum = 0;
		for(int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				totalNum += num[i][j];
			}
		}
		// System.out.println(totalNum);
		// 학생들의 수학과 영어 성적을 등록받는 프로그램이 있다.
		// 프로그램 실행 후 최대 학생의 수 입력, 입력받은 만큼 성적을입력하는
		// 프로그램 작성
		Scanner sc = new Scanner(System.in);
		System.out.print("등록할 학생의 인원 수 : ");
		int student = sc.nextInt();
		int[][] stGrade = new int[student][2];
		for (int i = 0; i < stGrade.length; i++) {
			for (int j = 0; j < stGrade[i].length; j++) {
				System.out.printf("학생 성적 입력 : ");
				int point = sc.nextInt();
				stGrade[i][j] = point;
			} // for ed
			System.out.printf("%d번 학생 : %d,%d\n",i+1,stGrade[i][0],stGrade[i][1]);
		} // for ed
		
		int[] scores = {95,71,84,93,87};
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		System.out.println("총 합 : " + sum);
	}  // main ed
} // class ed