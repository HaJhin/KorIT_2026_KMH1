package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ProductService {
	List<Product> productList = new ArrayList<Product>();
	
	// 1. 상품 추가
	public void addProduct(Product product) {
		if (productList.contains(product)) {
			System.out.println("이미 존재하는 상품입니다.");
			return;
		}
		productList.add(product);
		System.out.println("상품 추가 성공");
	} // addProduct ed
	
	// 2. 전체 상품 출력
	public void printAllProduct() {
		System.out.println("==== 전체 상품 목록 ====");
		productList.forEach(p -> System.out.println(p.toString()));
	} // printAllProduct ed
	
	// 3. 상품 코드로 조회
	public Product findByCode(String code) {
		for (Product p : productList) {
			if (p.getCode().equals(code)) {
				System.out.println(p.toString());
				return p;
			} else {
				System.out.println("상품이 존재하지 않습니다.");
				break;
			}
		} // for ed
		return null;
	} // findByCode ed
	
	// 4. 상품 정보 수정
	public void updateProduct(String code,Function<Product, Product> updater) {
		for (Product p : productList) {
			if (p.getCode().equals(code)) {
				updater.apply(p);
				System.out.println("수정 완료");
				return;
			};
		} // for ed
		System.out.println("상품이 존재하지 않습니다.");
	} // updateProduct ed
	
	// 5. 조건에 맞는 상품 조회
	public void findProductsByCondition(Predicate<Product> predicate) {
		boolean stock = false;
		for (Product p : productList) {
			if (predicate.test(p)) {
				System.out.println(p.toString());
				stock = true;
			};
		} // for ed
		if (!stock) System.out.println("상품이 존재하지 않습니다.");
	} // findProductsByCondition ed
	
	// 6. 조건에 맞는 상품 제거
	public void deleteProductsByCondition(Predicate<Product> predicate) {
		boolean stock = false;
		for (Product p : productList) {
			if (predicate.test(p)) {
				productList.remove(p);
				stock = true;
			};
		} // for ed
		if (!stock) System.out.println("상품이 존재하지 않습니다.");
	} // deleteProductsByCondition ed
	
} // class ed
