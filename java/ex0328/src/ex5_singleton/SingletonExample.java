package ex5_singleton;

public class SingletonExample {
	public static void main(String[] args) {
		// 생성자가 private로 정의되어 있기 때문에 다른 클래스에서 호출하는 것이 불가능
		//Singleton obj = new Singleton();
		
		Singleton st1 = Singleton.getInstance();
		Singleton st2 = Singleton.getInstance();
		
		// st1과 st2가 같은 객체인지 증명하기
		
		System.out.println(st1);
		System.out.println(st2);
		
		if (st1 == st2) {
			System.out.println("같습니다.");
		} else {System.out.println("다릅니다");}
	}
}
