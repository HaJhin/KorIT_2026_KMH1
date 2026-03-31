package ex2_super;

public class Main {
	public static void main(String[] args) {
		SuperSonicAirPlane SSAP = new SuperSonicAirPlane();
		
		SSAP.takeOff();
		SSAP.fly();
		SSAP.changeMode();
		SSAP.fly();
		SSAP.changeMode();
		SSAP.fly();
		SSAP.land();
	}
}
