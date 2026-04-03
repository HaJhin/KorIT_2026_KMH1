package ex1_exception.throwsexample;

public class Converter2 {
	OrderService os = new OrderService();
	
	public void toInt(String price,String count) throws IllegalArgumentException {
		int priceI = Integer.parseInt(price);
		int countI = Integer.parseInt(count);
		if (priceI <= 0) throw new IllegalArgumentException("금액은 1이상이어야함");
		if (countI <= 0) throw new IllegalArgumentException("개수는 1이상이어야함");
		os.totalPrice(priceI, countI);
	}
}

class OrderService {
	public void totalPrice(int price,int count) {
		System.out.println("총금액 : " + (price*count));
	}
}

