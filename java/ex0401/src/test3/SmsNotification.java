package test3;

public class SmsNotification implements Notification{

	@Override
	public void send() {
		System.out.println("[SMS] 인증번호 전송");
	}

}
