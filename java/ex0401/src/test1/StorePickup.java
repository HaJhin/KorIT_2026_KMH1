package test1;

public class StorePickup extends Delivery {
	
	@Override
	public void ship() {
		System.out.println("매장수령으로 수령합니다.");
	}
}
