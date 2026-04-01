package ex2_interface;

// 리모컨에 대한 가이드라인(인터페이스)
public interface RemoteControl {
	// 상수 
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0; // public static final 없어도 상수
	
	
	// 추상 메서드
	public void turnOn();
	public void setVolume(int volume);
	
	// 디폴트 메서드
	// 디폴트 메서드에는 실행부가 있다
	// 상수 필드를 읽거나 추상 메서드를 호출하는 코드 작성 가능
	// 구현 클래스는 디폴트 메서드를 오버라이딩하여 자신에게 맞게 수정 가능
	// 재정의할 시 주의할 점 : public 제한자 고정, default 키워드 생략
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음처리합니다.");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음해제합니다.");
		}
	}
	
	// 정적 메서드
	// static 메서드는 구현 객체가 없어도 인터페이스만으로 호출 가능
	static void changeBattery() {
		System.out.println("리모컨 건전지 교환 ");
	}
	
	// private 메서드
	private void config() {
		System.out.println("설정모드 접근");
	}
}
