package ex1_generic.test;

public class PaymentProcessor<T extends Payment> {
	private T payment;

	public PaymentProcessor(T payment) {
		super();
		this.payment = payment;
	}
	
	public void process() {
		payment.pay();
	}
}
