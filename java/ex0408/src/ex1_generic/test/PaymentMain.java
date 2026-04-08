package ex1_generic.test;

public class PaymentMain {
	public static void main(String[] args) {
		PaymentProcessor<Payment> cardPay = 
				new PaymentProcessor<Payment>(new CardPayment());
		PaymentProcessor<Payment> kakaoPay =
				new PaymentProcessor<Payment>(new KakaoPayment());
		
		cardPay.process();
		kakaoPay.process();
	}
}
