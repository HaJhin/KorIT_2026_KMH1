package ex0722.cohension;

// 시간적 응집도
// 서로 다른 기능들이지만 '프로그램이 닫히는 시점'에 한꺼번에 실행되어야해서
// 한곳에 모아둔 경우
// - 저장, DB연결 해제, 파일 삭제 등 완전히 서로 상관없는 기능들이 묶여 있음
// - 시간 시점에 의존하므로, 개별 작업을 독립적으로 활용할 수 없음
// 특정 작업에서 예외가 발생하면 나머지 종료 작업들이 정상적으로 수행되지 않을 수도 있음
public class SystemExitManager {
	public void onSystemExit() {
		saveUserSettings(); // 설정값 저장
		disconnectDatabase(); // db연결 종료
		deleteTemporaryFiles(); // 임시파일 삭제
	}

	private void saveUserSettings() {
		System.out.println("설정값을 저장합니다.");
		
	}

	private void disconnectDatabase() {
		System.out.println("데이터베이스 연결을 안전하게 끊습니다.");
		
	}

	private void deleteTemporaryFiles() {
		System.out.println("사용자 설정을 파일에 저장합니다.");
		
	}
}
