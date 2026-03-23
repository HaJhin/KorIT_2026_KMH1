package ex1_datatype;

public class DemotionExample {
	public static void main(String[] args) {
		// 컴파일 단계에서 연산
		byte result = 10 + 20;
		System.out.println("result : " + result);
		byte v1 = 10;
		byte v2 = 20;
		// 자바에서 byte,short,char끼리의 연산은 자동으로 int로 변환된다.
		// 실행 시점에 연산이 된다.
		// 컴파일러는 확실히 값이 고정된 경우에만 미리 계산한
		byte v3 = (byte)(v1 + v2);
		int v4 = v1 + v2;
		
	}
}
