package test4;

public class HybridCar extends Car {
	int electricGauge;

	public HybridCar(int gasGauge,int electricGauge) {
		super(gasGauge);
		this.electricGauge = electricGauge;
	}
	
	@Override
	public void showCurrentGauge() {
		System.out.println("전기 잔량 : " + electricGauge);
		System.out.println("가스 잔량 : " + gasGauge);
	}
}
