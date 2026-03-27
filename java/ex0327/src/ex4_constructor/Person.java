package ex4_constructor;

public class Person {
	// 필드
	String name;
	int age;
	
	// 생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void introduce() {
		System.out.printf("안녕하세요, 저는 %d살 %s입니다.",age,name);
	}
}
