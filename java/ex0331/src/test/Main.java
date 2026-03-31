package test;

public class Main {
	public static void main(String[] args) {
		Person p = new Person("B", 20);
		// 필드에 값을 초기화하는 법
		// 1. 직접 초기화
		// 2. 생성자를 통해 초기화
		// 3. getter를 통해 초기화
		// 필드
		p.name = "A";
		p.age = 17;
	}
}
