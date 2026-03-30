package penmanager;

public class PenMain {
	public static void main(String[] args) {
		FountainPen fp = new FountainPen(5, "RED");
		
		System.out.println("잉크의 잔량 :" + fp.getAmount());
		System.out.println("잉크의 색 : " + fp.getColor());
		fp.refill(10);
		System.out.println("리필된 잉크 잔량 : " + fp.getAmount());
		
		SharpPen sp = new SharpPen(3, 5);
		System.out.println("잉크의 잔량 : " + sp.amount);
		System.out.println("펜촉의 두께 : " + sp.width);
	}
}
