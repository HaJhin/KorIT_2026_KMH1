package test.case2;

public class Main {
	public static void main(String[] args) {
		Product product = new Product("사과", 5);
		product.printInfo();
		product.seil(3);
		product.printInfo();
		product.seil(10);
		product.printInfo();
	}
}
