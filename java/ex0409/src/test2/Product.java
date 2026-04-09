package test2;

public class Product {
	private String name;
	private int price;
	private int quantity;
	
	public Product(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getTotalPrice() {
		return price*quantity;
	}

	@Override
	public String toString() {
		String str = String.format("%s (%d원)x %d개",name,price,quantity);
		return str;
	}
}
