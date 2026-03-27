package ex3_overloading;

public class OverloadingExample {
	// 메서드의 오버로딩
	// 메서드의 이름은 동일
	// 1. 매개변수의 개수 같아야 함
	// 2. 개수가 같다면 타입이 달라야함
	// 3. 개수와 타입이 같다면 순서가 달라야함
	
	public int plus(int x,int y) {
		return x+y;
	}
	
	public double plus(double x,double y) {
		return x+y;
	}
}
