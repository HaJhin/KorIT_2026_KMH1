package ex1_class;

public class StudentMain {
	public static void main(String[] args) {
		Student st = new Student();
		st.name = "A";
		st.age = 10;
		st.score = 10;
		Student st2 = new Student();
		st2.name = "B";
		st2.age = 20;
		st2.score = 20;
		Student st3 = new Student();
		st3.name = "C";
		st3.age = 30;
		st3.score = 30;
		
		// 배열에는 같은 타입의 데이터만 넣을 수 있다.
		// 데이터의 타입은 배열 앞에 명시       
		Student[] students = {st,st2,st3};
		
		for (int i = 0; i < students.length; i++) {
			System.out.println("이름 : " + students[i].name);
			System.out.println("나이 : " + students[i].age);
			System.out.println("성적 : " + students[i].score);
			System.out.println("--------------------");
		}
	}
}
