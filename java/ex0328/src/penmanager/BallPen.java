package penmanager;

public class BallPen extends Pen { // 펜을 상속받는 볼펜 클래스
	String color;

	public BallPen(int amount, String color) {
		super(amount);
		this.color = color;
		System.out.println("BallPEN");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
