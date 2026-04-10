package test2;

import java.util.ArrayList;
import java.util.List;

public class Cart {  
	private List<Product> listP = new ArrayList<Product>();
	
	// 1.상품 추가(이미 있는 상품일 시 적은 수만큼 수량 증가
	public void addProduct(String name,int price,int quantity) {
		for (Product p : listP) {
			if (name.equals(p.getName())) {
				p.setQuantity(p.getQuantity()+quantity);
				System.out.println("수량 증가 완료");
				return;
			} // if ed 
		} // for ed
		listP.add(new Product(name, price, quantity));
		System.out.println("상품 추가 완료");
	} // addProduct ed
	
	// 2.장바구니 전체 출력
	public void printCart() { 
		if (listP.isEmpty()) {
			System.out.println("장바구니는 비어있습니다.");
			return;
		}
		for (Product p : listP) {
			System.out.println(p.toString());
		}
	} // printCart ed
	
	// 3.장바구니 총 가격 출력
	public void printTotalPrice() {
		int totalPrice = 0;
		for (Product p : listP) {
			totalPrice += p.getTotalPrice();
		} 
		System.out.println("총 금액 : " + totalPrice);
	} // printTotalPrice ed
	
	// 4.특정상품 개수 증가
	public void increaseQuantity(String name,int quantity) {
		for (Product p : listP) {
			if (name.equals(p.getName())) {
				p.setQuantity(p.getQuantity()+quantity);
				System.out.println("수량 증가 성공");
				return;
			} // if ed
		} // for ed
		System.out.println("상품이 존재하지 않습니다.");
	} // increaseQuantity ed
	
	// 5. 장바구니 상품 제거
	public void removeProduct(String name) {
		for (Product p : listP) {
			if (name.equals(p.getName())) {
				listP.remove(p);
				System.out.println("삭제 완료");
				return;
			}
		} // for ed
		System.out.println("상품이 존재하지 않습니다.");
	} // removeProduct ed
	
} // Cart ed
