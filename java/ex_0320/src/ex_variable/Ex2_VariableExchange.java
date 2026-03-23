package ex_variable;

public class Ex2_VariableExchange {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		int w = x;
		System.out.println("교환 중...");
		x = y;
		y = w;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}
}
