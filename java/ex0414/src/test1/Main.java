package test1;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		ProductService ps = new ProductService();
		
		ps.addProduct(new Product("P001", "삼각김밥", 1200, 10));
		ps.addProduct(new Product("P002", "콜라", 2000, 0));
		ps.addProduct(new Product("P003", "도 시 락", 4500, 5));
		
		// 1. 전체 상품 출력
		ps.printAllProduct();
		
		// 10% 증가 람다식
		Function<Product, Product> upPrice = p -> {
			p.setPrice((int)(p.getPrice()*1.1));
			return p;
		};
		
		// 2. 상품 10% 증가
		ps.updateProduct("P001", upPrice);
		
		// 상품명 공백 제거 람다식
		Function<Product, Product> removeGap = p -> {
			p.setName(p.getName().replace(" ",""));
			return p;
		};
		
		// 3. 상품명 공백 제거
		ps.updateProduct("P003", removeGap);
		
		// 조건에 맞는 상품을 찾는 람다식
		Predicate<Product> findInStock = p -> p.getStock()!=0;
		
		// 4. 재고가 있는 상품 찾기
		ps.findProductsByCondition(findInStock);
		
		// 조건에 맞는 상품 제거 람다식
		Predicate<Product> delOutOfStock = p -> p.getStock()==0;
		
		// 5. 조건에 맞는 상품 제거
		ps.deleteProductsByCondition(delOutOfStock);
		
		// 6. 전체 상품 출력
		ps.printAllProduct();
	}
}
