package ex5_polymorphism.exam1;

public class CarMain {
	public static void main(String[] args) {
		Car car = new Car();
		car.tire = new Tire();
		car.speed = 100;
		car.brand = "BMW";
		
		
		car.run();
		
		car.changeHankook();
		car.run();
		car.changeKumho();
		car.run();
	}
}
