package ex7_Array;

public class ArrayExample {
	public static void main(String[] args) {
		// {1,2,3,4,5}; -> 초기화 리스트
		// 배열을 선언함과 동시에 초기화 리스트를 사용하는 것이 가능하다.
		int[] arr = {1,2,3,4,5};
		int[] arr2; // 배열의 선언
		// arr2 = {100,200,300}; 선언 후 초기화 리스트 대입은 불가능.
		// new 연산자를 통한 배열의 생성
		// 값이 들어있지는 않지만 후에 값을 저장할 목적으로 미리 배열 생성 가능
		int[] ar = new int[5]; // int 크기만큼 5개의 공간이 있는 배열
		// new 연산자로 배열을 처음 생성하면 배열 항목은 기본값으로 초기화된다.
		// 정수형 : 0
		// 실수형 : 0.0
		// 문자형 : ''
		// 참조형 : null
		ar[0] = 100;
		ar[1] = 200;
		ar[2] = 300;
		ar[3] = 400;
		ar[4] = 500;
		
		for(int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		int[] iAr = {1,2,3,4,5,6,7,8,9,10};
		int total = 0;
		for (int i = 0; i < iAr.length; i++) {	
			total += iAr[i];
		}
		System.out.println(total);
	}
}
