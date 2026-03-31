package test3;

public class CalMain {
	public static void main(String[] args) {
		CalPlus cp = new CalPlus();
		CalMinus cm = new CalMinus();
		
		System.out.println(cp.getResult(5,3));
		System.out.println(cm.getResult(5, 3));
				
	}
}
