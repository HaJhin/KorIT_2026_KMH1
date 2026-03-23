package ex3_print;

public class SingleOperatorExample {
	public static void main(String[] args) {
		// 부호를 결정하는 연산자
		int x = -100;
		x = -x;
		System.out.println("x의 값 : " + x);
		
		// 증감연산자
		// 1씩 증가시키거나 1씩 감소시키는 연산자
		// 1씩 증가시키거나 1씩 감소시키는 연산자
		// ++ : 1을 증가
		// -- : 1을 감소
		// 전위연산
		// 연산자가 앞에 오는 연산
		int a = 5;
		System.out.println(++a); // 6
		// 후위연산
		// 연산자가 뒤에 오는 연산
		int b = 10;
		System.out.println(b--); // 10
		System.out.println(b); // 9
	}
}
