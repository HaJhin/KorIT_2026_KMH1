package ex1_overriding;

public class Main {
	public static void main(String[] args) {
		//double r = 5.0;
		
		// Calculator 객체 만들고 메서드 호출
		//Calculator calculator = new Calculator();
		//Computer computer = new Computer();
		
		// 컴퓨터 객체를 만들어서 오버라이딩 된 메서드 호출
		//System.out.println(calculator.areaCircle(r));
		//System.out.println(computer.areaCircle(r));
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		animal.sound();
		dog.sound();
		cat.sound();
	}
}
