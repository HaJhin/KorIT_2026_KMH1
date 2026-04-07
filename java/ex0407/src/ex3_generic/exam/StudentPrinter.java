package ex3_generic.exam;

public class StudentPrinter {
	
	public <T,U> void printStudent(T name,U age) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
