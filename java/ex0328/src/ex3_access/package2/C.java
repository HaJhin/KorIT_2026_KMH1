package ex3_access.package2;

// package1의 모든 클래스를 사용한다.
import ex3_access.package1.*;

public class C {
	// A a; default로 선언되어있기 때문에 다른 패키지에선 접근 X
	B b; // public 이기 때문에 가능
}
