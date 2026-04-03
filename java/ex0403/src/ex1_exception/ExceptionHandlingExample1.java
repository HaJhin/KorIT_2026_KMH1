package ex1_exception;

// NullpointerException : 참조 변수가 Null인 상태에서 필드나 메서드에 접근할 경우
public class ExceptionHandlingExample1 {
	// 문자열 데이터를 전달받아서 문자열의 길이가 얼마인지 출력하는 메서드
	public static void method1(String string) {
		try {
			System.out.println("문자열의 길이 : " + string.length());
		} catch (NullPointerException e ) {
			// e.getMessage(); 예외가 발생한 이유만 반환
			// e.toString(); 예외의 종류도 반환
			e.printStackTrace(); // 예외가 어디서 발생했는지 추적한 내용까지 반환
		} finally {
			System.out.println("시스템 종료");
		} // try catch finally ed
	} // method1 ed
	
	public static void method2(String string) { 
		System.out.println("문자열의 길이 : " + string.length());
	} // method2 ed
	
	public static void main(String[] args) {
		// method1("Parrhesia");
		method1(null);
		
	}
}
