package ex1_datatype;

public class BooleanExample {
	public static void main(String[] args) {
		 boolean b1 = true;
		 boolean b2 = false;
		 
		 boolean isOn = true; // 전등이 켜져있는 상태
		 boolean isStudent = false; // 학생 X
		 
		 // boolean 변수를 다른 변수에 대입할 수 있다.
		 boolean copy = isOn;
		 System.out.println("복사한 값 : " + copy);
		 
		 // boolean은 true/false값만 올 수 있다.
		 isOn = false;
		 System.out.println(isOn);
	}
}
