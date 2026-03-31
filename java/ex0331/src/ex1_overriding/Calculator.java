package ex1_overriding;

public class Calculator {
	// 반지름을 외부에서 받아 원의 넓이를 반환하는 areaCircle메서드 작성
	
	
	public double areaCircle(double r) {
		System.out.println("method.");
		double result = r*r*3.14;
		return result;
	}
}
