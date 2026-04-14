package exam3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
			List<Member> list = new ArrayList<Member>();
			list.add(new Member("홍길동",15));
			list.add(new Member("임꺽정",25));
			list.add(new Member("장길산",30));
			
			Predicate<Member> checkAge = member -> member.age > 20;
			
			System.out.println("==  20세 이상==");
			for (Member member : list) {
				if (checkAge.test(member)) {
					System.out.printf("이름 : %s / 나이 : %d\n",member.name,member.age);
				}
			} // for ed
			
	}
}
