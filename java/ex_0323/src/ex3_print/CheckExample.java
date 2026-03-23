package ex3_print;

public class CheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x/y;
		System.out.println(Double.isInfinite(z));
		z = x%y;
		// NaN : Not a Number
		System.out.println(Double.isNaN(z));
	}
}
