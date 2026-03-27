package ex4_constructor;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("홍길동", "020202-1234567");
		Korean k2 = new Korean("임꺽정", "030303-7654321");
		
		k1.showInfo();
		k2.showInfo();
		
		// 생성자의 매개변수명은 초기화시킬 변수명과 동일한 이름을 사용할 것.
	}
}
