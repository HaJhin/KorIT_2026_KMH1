package test2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cart cart = new Cart();
		
		outer : while (true) {
			System.out.println("=== 장바구니 시뮬레이터 ===");
			System.out.println("1. 상품 추가");
			System.out.println("2. 장바구니 목록 출력");
			System.out.println("3. 장바구니 총 금액 출력");
			System.out.println("4. 특정 상품 추가");
			System.out.println("5. 상품 제거");
			System.out.println("6. 시뮬레이터 종료");
			
			System.out.print("옵션 선택 : ");
			int num = sc.nextInt();
			
			switch (num) {
			case 1 :
				System.out.print("상품 이름 입력 : ");
				String addName = sc.next();
				System.out.print("상품 가격 입력 : ");
				int price = sc.nextInt();
				System.out.print("상품 개수 입력 : ");
				int addQuantity = sc.nextInt();
				cart.addProduct(addName, price, addQuantity);
				break;
			case 2 :
				cart.printCart();
				break;
			case 3 :
				cart.printTotalPrice();
				break;
			case 4 :
				cart.printCart();
				System.out.print("상품 이름 입력 : ");
				String plusName = sc.next();
				System.out.print("추가할 개수 입력 : ");
				int plusQuantity = sc.nextInt();
				cart.increaseQuantity(plusName, plusQuantity);
				break;
			case 5 :
				cart.printCart();
				System.out.print("제거할 상품 이름 입력 : ");
				String removeName = sc.next();
				cart.removeProduct(removeName);
				break;
			case 6 : 
				System.out.println("장바구니 시뮬레이터 종료");
				break outer;
			}
		}
	} // main ed
} // class ed
