package test2;

public class PaymentMain {
	public static void main(String[] args) {
		
		Order order = new Order();
		
		order.payment = new CardPayment();
		order.order(50000);
		
		order.payment = new KakaoPayment();
		order.order(30000);
	}
}
