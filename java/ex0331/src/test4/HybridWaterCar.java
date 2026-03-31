package test4;

public class HybridWaterCar extends HybridCar {
	int waterGauge;

	public HybridWaterCar(int gasGauge, int electricGauge, int waterGauge) {
		super(gasGauge, electricGauge);
		this.waterGauge = waterGauge;
	}
	
	@Override
	public void showCurrentGauge() {
		System.out.println("물 잔량 : " + waterGauge);
		System.out.println("전기 잔량 : " + electricGauge);
		System.out.println("가스 잔량 : " + gasGauge);
	}
}
