package test2;

public class Main {
	public static void main(String[] args) {
		Transport[] t = {
				new Bus("버스",1500),
				new Taxi("택시", 6000, 10, 2000),
				new AirPlane("비행기", 100000, 50000, 30000)
				};
		
		for (Transport transport : t) {
			transport.printFare(10);
		}
		
	}
}
