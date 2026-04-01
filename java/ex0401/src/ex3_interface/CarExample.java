package ex3_interface;

public class CarExample {
	public static void main(String[] args) {
		Car c = new Car();
		
		c.hTire = new HankookTire();
		c.kTire = new HankookTire();
		
		c.run();
		
		c.hTire = new KumhoTire();
		c.kTire = new KumhoTire();
		
		c.run();
	}
}
