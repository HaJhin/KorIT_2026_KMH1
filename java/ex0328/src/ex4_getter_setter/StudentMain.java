package ex4_getter_setter;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student st1 = new Student();
		
		String stName = sc.next();
		st1.setName(stName);
		int stAge = sc.nextInt();
		st1.setAge(stAge);
		
		System.out.println("학생의 이름 : " + st1.getName());
		System.out.println("학생의 나이 : " + st1.getAge());
	}
}
