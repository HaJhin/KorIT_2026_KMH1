package ex2_system;

public class TimeExample {
	public static void main(String[] args) {
		// 1970년 1월 1일 0시 0분 0초부터 현자낒 흐른 시간을 밀리초 단위로 반환
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		long start = System.currentTimeMillis();
		
		// 나노초 (1초 = 10억ns)
		start = System.nanoTime();
		
		// 작업
		for (int i = 0; i < 10000000; i++) {};
			long end = System.nanoTime();
			
			System.out.println("걸린 시간 : " + (end-start));
		
	}
}
