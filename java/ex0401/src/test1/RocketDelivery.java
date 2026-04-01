package test1;

public class RocketDelivery extends Delivery{
	
	@Override
	public void ship() {
		System.out.println("로켓배송으로 수령합니다.");
	}
}
