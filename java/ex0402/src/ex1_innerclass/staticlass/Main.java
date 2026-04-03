package ex1_innerclass.staticlass;


public class Main {
	// 정적 내부 클래스의 객체 생성방법
	Outer.Inner inner = new Outer.Inner();
	
	User.Builder user = new User.Builder().id("hong");
	
}
