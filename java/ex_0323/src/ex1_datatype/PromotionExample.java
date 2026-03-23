package ex1_datatype;

public class PromotionExample {
	public static void main(String[] args) {
		// 자동 타입 변환
		// 작은 자료형 -> 큰 자료형으로 변환할때 자동변환이 된다.
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		// 문자형의 자동형변환
		// 문자형 -> 정수형타입
		char c = 'A';
		int num = c; // 문자형타입 데이터를 정수형변수에 대입
		System.out.println(num);
	}
}
