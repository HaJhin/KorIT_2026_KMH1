package ex1_final;

public class Korean {
	// final 필드를 선언하는 두가지 방법

	// 1. 선언과 동시에 값을 초기화한다.
	final String nation = "대한민국";
	final String ssn;
	
	public Korean(String ssn) {
		this.ssn = ssn;        
	}
}
