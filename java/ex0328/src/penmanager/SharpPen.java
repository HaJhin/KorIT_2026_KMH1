package penmanager;

public class SharpPen extends Pen { // 펜을 상속받는 샤프펜 클래스
	int width;

	public SharpPen(int amount, int width) {
		super(amount);
		this.width = width;
		System.out.println("SHARPPEN");
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
}
