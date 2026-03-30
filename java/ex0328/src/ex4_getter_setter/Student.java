package ex4_getter_setter;

public class Student {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if (age < 0) { 
			System.out.println("잘못된 나이입니다");
		} else this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public Student() {}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}
