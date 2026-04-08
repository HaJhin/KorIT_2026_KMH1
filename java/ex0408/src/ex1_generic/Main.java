package ex1_generic;

public class Main {
	public static void main(String[] args) {
		Member mem1 = new Member("홍길동", 20);
		MemberResponse<Member> mr = new MemberResponse<Member>
		(true, "회원가입 성공", mem1);
		
		System.out.println("성공 여부"+mr.isSuccess());
		System.out.println("메시지 : "+mr.getMessage());
		System.out.println("회원 이름 : "+mr.getData(mem1).getName());
		System.out.println("회원 나이 : "+mr.getData(mem1).getAge());
	}
}
