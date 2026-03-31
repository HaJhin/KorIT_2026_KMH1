package ex5_static;

public class Calculator {
	
	// static 키워드가 붙어있으면 메모리에 한번만 올라간다.
	// 모든 객체가 static 필드값을 공유한다.
	
	// 파이 : 3.141592
	static double pi = 3.141592;
	
	// 외부에서 두 수를 받아 더하여 반환하는 plus 메서드 작성
	
	static public int plus(int num1,int num2) {
		return num1+num2;
	}
	
	static public int minus(int num1,int num2) {
		return num1-num2;
	}
}
