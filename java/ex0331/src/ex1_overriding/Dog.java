package ex1_overriding;

public class Dog extends Animal {
	
	@Override
	public void sound() {
		System.out.println("개가 멍멍 짖는다.");
	}
}
