package test2;
// 추상 클래스
abstract class Animal {
	// 추상 메서드
	abstract public void sound();
	// 추상 클래스에도 일반적인 필드나 메서드가 들어갈 수 있다.
	int feed;
	public void breath() {
		System.out.println("숨쉰다.");
	}
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}