package ex2_method;

public class Carculator {
	// 계산기 기능이 있는 메서드
	public int getResult(int x, int y, String op) {
		switch (op) {
		case "+" : return x+y;
		case "-" : return x-y;
		case "*" : return x*y;
		case "/" : return x/y;
		default : return -1;
		} // switch ed 
	}
}
