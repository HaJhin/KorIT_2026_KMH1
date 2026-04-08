package ex1_reflection.log;

public class FIleLogger implements Logger {

	@Override
	public void log(String message) {
	System.out.println("[File]에 로그 저장 : "+message);
	}

}
