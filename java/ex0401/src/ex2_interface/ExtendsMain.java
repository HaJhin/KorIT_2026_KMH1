package ex2_interface;

public class ExtendsMain {
	public static void main(String[] args) {
		InterfaceImpl impl = new InterfaceImpl();
		// 인터페이스의 타입 변환
		// 인터페이스와 구현클래스 사이에서 발생한다.
		// 자동 타입변환
		// 구현 객체를 인터페이스 타입변수에 대입할 때
		
		InterfaceA ia = impl;
		ia.methodA();
		// ia.methodB();
		// ia.methodC();
		
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.metohdC();
		System.out.println();
	}
}
