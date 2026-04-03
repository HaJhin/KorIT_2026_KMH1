package test1;

public class RemoteControl {
	
	String power = "OFF";
	
	
	
	class Button {
		void press() {
			System.out.println("전원을 켭니다.");
			power = "ON";
		} // press ed
	} // Button ed
	
}
