package ex5_polymorphism.exam2;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.drive(new Bus());
		driver.drive(new Taxi());
	}
}
