package ex6_inheritance;

public class Phone {
	public String model;
	public String color;
	
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("Phone생성자 실행");
	}
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	public void sendMessage(String message) {
		System.out.println("나 : " + message);
	}
	public void reciveMessage(String message) {
		System.out.println("상대방 : " + message);
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
