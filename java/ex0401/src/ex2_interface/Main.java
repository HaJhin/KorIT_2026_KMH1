package ex2_interface;

public class Main {
	public static void main(String[] args) {
		// 인터페이스도 하나의 타입이기 때문에 변수의 타입으로 사용할 수 있다.
		Searchable sc;
		RemoteControl rc;
		
		rc= new TV();
		rc.turnOn();
		
		TV tv = new TV();
		
		// 인터페이스의 객체 생성 불가능
		// 상수는 그냥 호출 가능
		System.out.println("최대 볼륨 : " + RemoteControl.MAX_VOLUME);
		System.out.println("최소 볼륨 : " + RemoteControl.MIN_VOLUME);
		
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		
		SmartTV sTV = new SmartTV();
		
		sTV.turnOn();
		sTV.search("https://youtube.com");
	}
}
