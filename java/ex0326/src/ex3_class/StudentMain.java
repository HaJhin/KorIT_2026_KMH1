package ex3_class;

import java.util.Arrays;

public class StudentMain {
	public static void main(String[] args) {
		Student st = new Student();
		
		st.name = "홍길동";
		st.age = 18;
		st.score = 90;
		
		//System.out.println("학생의 이름 : " + st.name);
		// System.out.println("학생의 나이 : " + st.age);
		// System.out.println("학생의 성적 : " + st.score);
		
		Student[] stArr = new Student[3];
		
		for (int i = 0; i < stArr.length; i++) {
			stArr[i].name = "A"; stArr[i].age = 10; 
		}
		
	}
}
