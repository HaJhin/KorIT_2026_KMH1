package ex3_print;

public class BitShiftOfperatorExample {
	public static void main(String[] args) {
		int num1 = 1; // 0001
		int result1 = num1 << 3;
		int result2 = num1 * (int)Math.pow(2,3);
		System.out.println("result1 : " + result1);
		int num2 = -8; // 00001000 -> 11110111 -> 11111000
		int result3 = num2 >> 3;
		System.out.println(result3);
		// >> : 부호는 유지하면서 오른쪽으로 이동하는 연산 
	}
}
