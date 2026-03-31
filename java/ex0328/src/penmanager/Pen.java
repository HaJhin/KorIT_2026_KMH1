package penmanager;

public class Pen { // 최상위 부모 클래스
	private int amount;

	public Pen(int amount) {
		this.amount = amount;
		System.out.println("PEN");
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
