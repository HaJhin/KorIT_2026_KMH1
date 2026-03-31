package test2;

public class Order {
	Payment payment = new Payment();
	
	public void order(int x) {
		payment.amount = x;
		payment.pay();
	}
	
	
}
