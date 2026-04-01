package ex4_innerclass;

public class Order {
	int orderNumber;
	
	public Order(int orderNumber) {
		super();
		this.orderNumber = orderNumber;
	} // const ed
	
	public void printOrderInfo(Item[] items) {
		System.out.println("주문번호" + orderNumber);
		for (Item i : items) {
			i.printInfo();
		}
	}
	
	class Item {
		String name;
		int price;
		int count;
		public Item(String name, int price, int count) {
			super();
			this.name = name;
			this.price = price;
			this.count = count;
		} // const ed
		
		public void printInfo() {
			System.out.println("상품명 : " + name);
			System.out.println("가격 : " + price + "원");
			System.out.println("수량 : " + count + "개");
			System.out.println("---------------------");
		}
	} // Item ed
} // Order ed
