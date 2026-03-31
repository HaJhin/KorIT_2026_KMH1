package ex2_super;

public class SuperSonicAirPlane extends AirPlane{
	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	
	// NORMAL 상수로 초기화된 flyMode 필드 선언
	
	int flyMode = NORMAL;
	
	// fly() 메서드 오버라이딩
	// flyMode가 SUPERSONIC이라면 "초음속 비행을 합니다. 출력
	// 아니라면 부모의 fly() 출력
	
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행을 합니다.");
		} else super.fly();
	} // ed
	
	public void changeMode() {
		System.out.println("모드전환");
		if (flyMode == NORMAL) flyMode = SUPERSONIC;
		else flyMode = NORMAL;
	}
}
