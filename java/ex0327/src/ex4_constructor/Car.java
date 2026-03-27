package ex4_constructor;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	// 반환타입 x 
	// 생성자의 이름 = 클래스명
	public Car() {
		
	} // Car ed
	
	// 모델만 초기화하는 생성자
	public Car(String model) {
		this.model = model;
	}

	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public Car(String model, String color,int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
