package ex1_generic.test;

public class BoxMain {
	public static void main(String[] args) {
		
		// Readable과 Closeable을 동시에 구현한 클래스만이 타입 할당 가능
		BoxClass<BoxType> box = new BoxClass<>();
		// BoxClass<Object> box2 = new BoxClass<Object>(); // 이건 안됨
	}
}
