package ex3_interface;

public class Car {
	Tire hTire;
	Tire kTire;
	
	public void run() {
		hTire.roll();
		kTire.roll();
	}
}
