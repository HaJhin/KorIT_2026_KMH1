package ex2_object;

public class Student {
	
	private int no;
	private String name;
	
	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	} // Ctor ed

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// Object 클래스의 hashcode()메서드를 오버라이딩
	// 학생 번호와 이름 해시코드를 합한 새로운 해시코드를 반환
	@Override
	public int hashCode() {
		int hashcode = no + name.hashCode();
		return hashcode;
	}
}
