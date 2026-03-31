package test2;

public class Zoo {
	
	// 추상 클래스는 객체 직접생성 불가능
	// Animal a = new Animal();
	
	public void printSound(Animal animal) {
		animal.sound();
	}
}
