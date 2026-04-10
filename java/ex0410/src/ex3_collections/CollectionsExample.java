package ex3_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Collections 클래스
// 컬렉션을 다룰 때 자주 쓰는 기능들을 static 메서드로 모아둔 것
public class CollectionsExample {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(30);
		numbers.add(10);
		numbers.add(20);
		
		System.out.println(numbers);
		// 오름차순 정렬
		Collections.sort(numbers);
		System.out.println(numbers);
		
		List<String> fruits = new ArrayList<String>();
		
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("cherry");
		
		System.out.println(fruits);
		// 문자열은 사전순으로 정렬
		Collections.sort(fruits);
		System.out.println(fruits);
		
		// 내림차순 정렬
		// reverseOrder();
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println(numbers);
		
		// 순서뒤집기 : reverse();
		List<Integer> numbers2 = new ArrayList<>();
		numbers2.add(30);
		numbers2.add(10);
		numbers2.add(20);
		
		Collections.reverse(numbers2);
		System.out.println(numbers2);
		
		// 순서 섞기 : shuffle();
		List<Integer> numbers3 = new ArrayList<>();
		numbers3.add(1);
		numbers3.add(2);
		numbers3.add(3);
		numbers3.add(4);
		numbers3.add(5);
		numbers3.add(6);
		
		System.out.println(numbers3);
		Collections.shuffle(numbers3);
		System.out.println(numbers3);
		
		// 최대값, 최소값
		// max(), min()
		System.out.println(Collections.max(numbers3));
		System.out.println(Collections.min(numbers3));
		
		// 문자열의 값 비교는 사전 순으로 나열해 뒤에 나오는 것이 더 크다고 판단
		System.out.println(Collections.max(fruits));
	}
}
