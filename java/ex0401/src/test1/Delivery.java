package test1;

public abstract class Delivery {
	
	public void printlnvoice() {
		System.out.println("송장 출력");
	}
	
	 public abstract void ship();
	
	public void complete() {
		System.out.println("출력 완료");
	}
}
