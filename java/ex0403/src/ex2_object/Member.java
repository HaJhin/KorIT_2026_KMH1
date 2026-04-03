package ex2_object;

public class Member {
	String id;
	String name;

	public Member(String id,String name) {
		super();
		this.id = id;
		this.name = name;
	} // Ctor ed
	
	// instanceof 연산자 : 왼쪽에 있는 객체가 오른쪽의 타입인지 검사한다.
	// 일치하면 target 변수에 담는다.
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member target) {
			if((id+name).equals(target.id+name)) { // id 문자열이 같은지 비교
				return true;
			} // if ed
		} // if ed
		return false;
	} // equals ed
	
} // class ed
