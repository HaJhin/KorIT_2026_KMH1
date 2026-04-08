package ex1_reflection.log;

public class Main {
	public static void main(String[] args) {
		// 기존에 사용하던 방식 : 객체 생성 후 메서드 실행
		// 출력방식을 바꾸려면 자바 코드를 직접 수정을 해야한다.
		// Logger logger = new ConsoleLogger();
		
		// 프로그램의 동작 방식이 소스코드에 고정되어있다
		// 미리 확정된 객체 생성 방식
		// Logger logger = new ConsoleLogger();
		// logger.log("테스트");
		
		// 설정파일 방식
		// 프로그램이 실행될 때 설정파일을 읽어봐야 방법을 알 수 있다.
		Logger logger = LoggerFactory.getLogger();
		logger.log("테스트 메시지");
	}
}
