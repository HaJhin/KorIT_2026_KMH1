package ex1_lombok;

public class Main {
	public static void main(String[] args) {
		Member m1 = new Member();
		
		Member m2 = new Member("1234","홍길동",20);
		System.out.println(m2);
	}
}
