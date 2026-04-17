package ex1_stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class MiddleCalculatorExample {
	public static void main(String[] args) {
		// 스트림의 연산
		// 중간연산
		// 특징
		// 1. 메서드의 연산 결과로 다른 Stream 객체를 반환한다.
		// 2. 혼자서는 최종결과를 낼 수 없다.
		// 3. 최종연산이 와야 중간연산들이 실제로 동작한다.
		// 4. 중간연산은 메서드 체이닝을 통해 연결 가능하다.
		
		// filter(조건)
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		// 결과주의
		list.stream()
		.filter((a) -> a%2 == 0)
		.forEach(System.out::print);
		
		// 과정주의
//		for(int i = 0; i < list.size(); i++) {
//			if (list.get(i) % 2 == 0) {
//				System.out.println(list.get(i));
//			}
//		}
		
		System.out.println(list);
		
		// 요소의 변환
		// map(Function<T,R>)
		List<String> sList = List.of("Java","spring","react");
		
		sList.stream().map(String::toUpperCase)
		.forEach(System.out::println);
		
		// mapToInt()
		// 객체 스트림을 IntStream으로 변환한다
		List<String> list2 = List.of("a","bb","ccc");
		
		list2.stream()
		.mapToInt(String::length)
		.forEach(System.out::println);
		
		// 정렬계열
		// sorted()
		int[] arr = {5,2,9,1,7};
		
		// 오름차순 정렬
		Arrays.stream(arr)
		.sorted()
		.forEach(System.out::println);
		
		// 내림차순
		Arrays.stream(arr)
		.boxed() // 기본형 스트림을 객체 스트림으로 변경 Intstream -> Stream<Integer>
		.sorted((a,b)-> b-a)
		.forEach(x -> System.out.print(x+ " "));
		System.out.println();
		
		// sorted(Comparator<? super T>)
		// 사용자 정의 기준으로 정렬한다.
		
		// 중복 제거
		// distinct()
		
		int[] iArr = {1,1,2,3,3,3,3,4,4,4,4,4,5,5,6};
		
		Arrays.stream(iArr)
		.distinct()
		.forEach(x -> System.out.print(x + " "));
		
		// 객체의 equals()와 hashCode() 기준으로 중복을 제거
		// 기본타입은 ==으로 비교해서 같으면 삭제
		
		// 제한/건너뛰기
		
		// limit(long maxSize)
		// 앞에서부터 지정한 개수만 남김
		
		// skip(long n)
		// 앞의 n개를 건너 뜀
		System.out.println();
		IntStream.rangeClosed(1, 10)
		.skip(5)
		.forEach(x -> System.out.print(x + " "));
		
		// 상태확인
		// peek(Consumer<T>)
		
		System.out.println();
		sList.stream()
		.filter(s -> s.length() >= 5)
		.peek(s -> System.out.println("필터통과 = " + s))
		.map(String::toUpperCase)
		.peek(s -> System.out.println("변환 후 : " + s))
		.forEach(x -> System.out.print(x + " "));
	}
}
