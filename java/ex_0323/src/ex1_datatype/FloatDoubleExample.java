package ex1_datatype;

public class FloatDoubleExample {
	public static void main(String[] args) {
		// 리터럴 : 변수에 저장하기 위한 값 자체
		// 실수 리터럴 값은 기본타입으로 double로 취급한다.
		// 숫자 뒤에 f를 붙여 해당 값이 float라는걸 알려준다.
		// 정밀도
		float f1 = 0.1234567890123456789f;
		double d1 = 0.1234567890123456789;
		
		System.out.println("float" + f1);
		System.out.println("double" + d1);
		
		// 10의 거듭제곱 리터럴
		double d2 = 3e6; // -> 3 x 10^6
		float f2 = 3e6F; // -> 3 x 10^6
	}
}
