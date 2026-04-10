package ex1_set.HashSet;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Set 인터페이스가 제공하는 메서드
// void add(E e) : 데이터를 삽입
// void remove(Object o) : 선택된 데이터를 삭제
// void clear() : 모든 데이터 삭제
// int size() : 저장된 데이터의 개수를 반환

public class HashSetExample {
	public static void main(String[] args) {
		// HashSet 클래스는 Set에서 가장 많이 사용되는 구현클래스이다.
		Set<String> set = new HashSet<String>();
		
		set.add("JAVA");
		set.add("spring");
		set.add("React");
		set.add("JAVA"); // 에러는 나지 않지만 추가는 안됨
		
		//System.out.println(set);
		//System.out.println("개수 : "+set.size());
		
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,1,2,3));
		//System.out.println(set2);
		
		Set<Integer> lotto =  new HashSet<Integer>();
		
		while (lotto.size()<6) {
			int num = (int)(Math.random()*45)+1;
			lotto.add(num);
		}
		
		System.out.println(lotto);
		
		List<Integer> lotto2 = new ArrayList<Integer>(lotto);
		
		for (int i : lotto2) {
			System.out.println(i);
		} // for ed
		
		// set을 배열로 만들기
		// new Integer[0] -> 배열의 방 개수를 0으로 하면 set이 add해둔 개수만큼
		// 자동으로 배열에 index가 만들어진다.
		// toArray()
		Integer[] arr = lotto.toArray(new Integer[set.size()]);
		
	}
}
