package ex2_method;

public class MethodMain {
	public static void main(String[] args) { 
		
		// 객체 정의
		MethodExample me = new MethodExample();
		
		// 객체를 통해 메서드 호출
		// me.printInfo();
		
		//System.out.println(me.add(2,3));
		
		//System.out.println(me.circleArea(4));
		
		//System.out.println(me.circleRound(4));
		int [] arr = {1,3,4};
		//System.out.println(me.countEven(arr));
		
		System.out.println(me.countChar("AAABCDA", 'A'));
	}
}
