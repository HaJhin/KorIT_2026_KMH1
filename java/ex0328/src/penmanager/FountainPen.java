package penmanager;

// pen을 상속받는 ballpen 을 상속
public class FountainPen extends BallPen {

	public FountainPen(int amount, String color) {
		super(amount, color);
		System.out.println("FOUNTAINPEN");
	} 
	
	public void refill(int n) {
		System.out.println("잉크 충전!");
		super.setAmount(n);
	}
}
