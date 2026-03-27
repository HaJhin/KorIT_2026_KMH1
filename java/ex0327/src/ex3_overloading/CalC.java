package ex3_overloading;

public class CalC {
	// 직사각형의 넓이를 구하는 area 메서드 작성
	
	public void area(int x, int y) {
		System.out.println(x*y);
	}
	
	public int area(int x) {
		return x*x;
	}
}
