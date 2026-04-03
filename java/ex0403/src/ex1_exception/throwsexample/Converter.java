package ex1_exception.throwsexample;

public class Converter {
	
	public int toInt(String str) throws NumberFormatException {
		int num = Integer.parseInt(str);
		System.out.println("정수 변환 완료 : " + num);
		return num;
	}
}
