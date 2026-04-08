package ex1_generic.test;

public class KakaoPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("카카오 페이로 결제합니다.");
	}
	
}
