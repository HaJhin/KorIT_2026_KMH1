package test2;

public class Payment {
	int amount;
	
	public void pay() {
		System.out.println(amount + "원을 결제합니다.");
	}
}

class CardPayment extends Payment {
	@Override
	public void pay() {
		System.out.println(amount + "원을 카드로 결제합니다.");
	}
}


class KakaoPayment extends Payment {
	@Override
	public void pay() {
		System.out.println(amount + "원을 카카오페이로 결제합니다.");
	}
}