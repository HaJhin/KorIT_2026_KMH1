package test3;

public class Main {
	public static void main(String[] args) {
		Notification[] array = {
				new SmsNotification(),
				new EmailNotification()
		};
		
		for (Notification no : array) {
			no.send();
		}
	}
}
