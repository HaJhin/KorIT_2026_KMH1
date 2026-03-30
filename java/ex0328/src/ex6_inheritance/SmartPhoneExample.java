package ex6_inheritance;

public class SmartPhoneExample {
	public static void main(String[] args) {
		// 스마트폰 객체 생성
		SmartPhone sp = new SmartPhone("갤럭시","블랙");
		
		System.out.println("모델 : " + sp.model);
		System.out.println("색상 : " + sp.color);
		
		System.out.println("와이파이 상태 : " + sp.wifi);
		
		// phone으로부터 상속받은 메서드 호출
		sp.bell();
		sp.sendMessage("여보세요");
		sp.reciveMessage("안녕하세요. 전 홍길동임");
		sp.sendMessage("아~ 네. 반값습니다.");
		sp.hangUp();
		
		// SmartPhone의 메서드 호출
		sp.setWifi(true);
		sp.internet();
	}
}
