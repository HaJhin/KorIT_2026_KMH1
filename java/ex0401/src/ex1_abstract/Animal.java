package ex1_abstract;

//추상화의 목적
// 부모클래스만으로는 의미있는 객체 X
// 부모는 공통 개념일 뿐 단독으로는 의미가 없다.
public abstract class Animal {
	String name;
		
	// 추상클래스에는 일반적인 필드나 메서드가 들어갈 수 있다.
	public void eat() {
		System.out.println("밥을 먹는다.");
	}
	
	// 자식클래스가 재정의하기 위한 메서드
	abstract public void sound();
}
