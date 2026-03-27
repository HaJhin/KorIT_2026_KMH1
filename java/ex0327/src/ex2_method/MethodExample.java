package ex2_method;

public class MethodExample {
	// 메서드의 구조
	// 접근제한자 반환형 메서드명(매개변수){
	// 실행하고자 하는 명령
	// return 반환값;
	// }
	
	// 반환할 값이 없으면 반환형은 void
	// 외부에서 받을 값이 없으면 매개변수는 생략 가능하다.
	public void printInfo() {
		System.out.println("메서드 호출");
	}
	
	// 덧셈 메서드
	public int add(int x,int y) {
		return x+y;
	}
	
	// 원의 넓이를 구하는 circleArea메서드작성하기
	// 원의 넓이 : 3.14*반지름*반지름
	
	// 1. 메서드 정의한다.
	// 매개변수 설정 -> 코드블럭에 기능 정의 -> return값 정의
	public double circleArea(int r) {
		return r*r*3.14;
	} // circleArea ed
	
	// 원의 둘레를 구하는 circleRound 메서드 정의
	public double circleRound(double r) {
		return r*2*3.14;
	} // circleRound ed
	
	public int countEven(int[] num) {
		int total = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i]%2 == 0) total++;
		} // for ed
		return total;
	}
	
	public int countChar(String str,char ch) {
		int total = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) total++;
		}
		return total;
	} // main ed
} // class ed
