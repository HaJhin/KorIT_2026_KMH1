package ex6_inheritance;

public class SmartPhone extends Phone{
	public boolean wifi;
	
	public SmartPhone(String model,String color) {
		super(model,color); // 부모 생성자 호출 
	}
	
	// 생성자가 정의되어있지 않으면 컴파일러가 자동으로 기본생성자를 만든다.
	
	// 사용자가 직접 정의하는 순간 기본생성자는 사라진다. 

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태 변경");
	}
	
	public void internet() {
		System.out.println("인터넷 연결");
	}
}
