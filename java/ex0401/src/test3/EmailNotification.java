package test3;

public class EmailNotification implements Notification {
	@Override
	public void send() {
		System.out.println("[Email] 회원가입을 환영합니다.");
	}
}
