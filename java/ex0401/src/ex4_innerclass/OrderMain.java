package ex4_innerclass;

public class OrderMain {
	public static void main(String[] args) {
		Order order = new Order(20260401);
		Order.Item item1 = order.new Item("사과", 1000, 3);
		Order.Item item2 = order.new Item("바나나", 1500, 2);
		
		// order.printOrderInfo(item1);
		
		Order.Item[] items = {order.new Item("참외", 500, 5),item1,item2};
		
		order.printOrderInfo(items);
	} // main ed
}
