package ex1_list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		List<Integer> ages = new ArrayList<Integer>();
		
		List<Member> members = new ArrayList<>();
		Member m1 = new Member();
		m1.setName("홍길동");
		m1.setAge(30);
		members.add(m1);
		members.add(new Member("박민수",40));
		
		System.out.println(members.get(0).getName());
		System.out.println(members.get(0).getAge());
		
		System.out.println(members.get(1).getName());
		
		// "김철수"25
		members.add(new Member("김철수",25));
	}
}
