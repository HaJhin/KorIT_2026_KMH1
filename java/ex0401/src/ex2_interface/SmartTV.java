package ex2_interface;

public class SmartTV implements RemoteControl,Searchable{

	@Override
	public void search(String url) {
		System.out.println(url+"을 찾습니다.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("스마트TV를 켭니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}
	
}
