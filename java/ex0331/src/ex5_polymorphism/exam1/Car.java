package ex5_polymorphism.exam1;

public class Car {
	Tire tire;
	int speed;
	String brand;
	
	public void run() {
		tire.roll();
	}
	
	public void changeHankook() {
		tire = new HankookTire();
	}
	
	public void changeKumho() {
		tire = new KumhoTire();
	}
}
