package test;

// public : 프로젝트 내부 어디든 사용가능
// default : 같은 패키지 내부에서만 가능
// private : 같은 클래스 내부에서만 가능

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
