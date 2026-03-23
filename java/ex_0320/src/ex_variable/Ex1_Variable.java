package ex_variable;

public class Ex1_Variable {
	public static void main(String[] args) {
		int x = 10;
		System.out.println(x);
		x = 55;
		System.out.println(x);
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시");
		System.out.println(hour + "시간 " + minute + "분");
		// 총 몇분인지 구하기
		int totalMinute = hour * 60 + minute;
		System.out.println("총 " + totalMinute + "분");
		// 변수는 또다른 변수에 대입되어 메모리 간에 값을 복사할 수 있다.
		int a = 3;
		int b = a;
		System.out.println(a+b);
	}
}
