package ex4_class_casting;

class Parent{
	public void method1() {
		System.out.println("부모 메서드1");
	}
	
	public void method2() {
		System.out.println("부모 메서드2");
	}
}

class Child extends Parent {
	@Override
	public void method2() {
		System.out.println("자식 메서드2");
	}
	
	public void method3() {
		System.out.println("자식 메서드3");
	}
}

public class UpCastingExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2(); // 부모타입으로 변환해도 오버라이딩 메서드 호출
		// parent.method3(); 자식 클래스에 선언된 메서드 호출 불가능
		// 자식 객체를 부모타입으로 변환하면
		// 자식 클래스에 정의된 멤버를 사용할 수 없다.  
		
		((Child)parent).method3(); // parent를 임시로 자식타입으로 변환
		
		Child c2 = (Child)parent;
	}
}
