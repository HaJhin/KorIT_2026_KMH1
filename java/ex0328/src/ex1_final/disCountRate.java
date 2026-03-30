package ex1_final;

public class disCountRate {
	final double DIS_HIGH = 0.2;
	final double DIS_MID = 0.1;
	final double DIS_LOW = 0.05;

	public double checkDis(int price) {
		if (price >= 100000) {
			return DIS_HIGH;
		} else if (price >= 50000) {
			return DIS_MID;
		} else return DIS_LOW;
	}
	
	public double calculatePrice(int Price) {
		double disCount = checkDis(Price);
		double totalPrice = Price - (Price*disCount);
		return totalPrice;
	}
}
