package ex5_polymorphism.exam2;

// 운전자
public class Driver {
	
	// 매개변수로 부모타입 변수 투입
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}
