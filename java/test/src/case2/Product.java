package case2;

public class Product {
	String name;
	int stock;
	
	public Product(String name, int stock) {
		this.name = name;
		this.stock = stock;
	}
	
	public void sell(int amount) {
		if (stock >= amount) {
			System.out.println("판매 완료");
			stock -= amount;
			return;
		} else {
			System.out.println("재고가 부족합니다.");
			return;
		}
	}
	
	public void printInfo() {
		System.out.printf("상품명: %s, 재고: %d\n",name,stock);
	}
	
} // class ed
