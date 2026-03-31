package test4;

public class Car {
	int gasGauge;
	
	public Car(int gasGauge) {
		super();
		this.gasGauge = gasGauge;
	}
	
	public void showCurrentGauge() {
		System.out.println("가스 잔량 : " + gasGauge);
	}
}
