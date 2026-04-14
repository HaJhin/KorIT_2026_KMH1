package test1;

public class Main {
	public static void main(String[] args) {
		ProductService ps = new ProductService();
		
		ps.addProduct(new Product("P001", "삼각김밥", 1200, 10));
		ps.addProduct(new Product("P002", "콜라", 2000, 0));
		ps.addProduct(new Product("P003", "도시락", 4500, 5));
		
		ps.printAllProduct();
		
		
	}
}
