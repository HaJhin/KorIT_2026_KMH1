package ex4_constructor;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car(); // 기본생성자 호출
		
		Car car2 = new Car("자가용"); 
		
		Car car3 = new Car("자가용","빨강");
		
		Car car4 = new Car("택시","흰색",200); 
	}
}
