package ex3_access.method.package1;

public class B {
	// 메서드를 호출하기 전까진 실행 X
	public void method() {
		A a = new A();
		
		a.field1 = 1;
		a.field2 = 2;
		// a.field3 = 3;
		
		a.method1();
		a.method2();
		// a.method3();
	}
}
