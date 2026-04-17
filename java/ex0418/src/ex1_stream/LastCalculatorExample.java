package ex1_stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LastCalculatorExample {
	public static void main(String[] args) {
		// 최종연산
		// 스트림 처리의 마지막 단계
		// 이 단계가 와야 스트림이 실제로 동작
		// 스트림 파이프라인의 마지막에서 실행되는 연산

		// 특징
		// 1. 스트림을 끝낸다.
		// - 한번 사용한 스트림은 재사용 불가능
		// 2. 실제 실행을 일으킨다.
		// - 중간연산은 준비만 해두지만 최종연산은 작업을 실제 실행함
		// 3. 결과를 만들거나 소비함
		// 최종연산은 값을 반환하거나, 데이터를 출력하거나 저장하면서 끝난다.

		// count()
		// 조건에 맞는 요소 개수를 센다.
		List<String> words = Arrays.asList("java", "spring", "react");
		long count = words.stream().filter(x -> x.length() >= 5).count();
		System.out.println("길이가 5 이상인 요소의 갯수 : " + count);

		// anyMatch()
		// 하나라도 조건에 맞는 요소가 있으면 true
		List<Integer> numbers = Arrays.asList(1, 3, 5, 8);

		boolean result = numbers.stream().anyMatch(x -> x % 2 == 0);

		System.out.println("결과 : " + result);
		
		// allMatch()
		// 모든 요소가 조건에 맞아야 true
		result = numbers.stream().allMatch(x -> x % 2 == 0);
		System.out.println("결과 : " + result);
		
		// noneMatch()
		// 모든 요소가 조건에 하나도 맞지 않아야 true
		result = numbers.stream().noneMatch(x -> x % 2 == 0);
		System.out.println("결과 : " + result);
		
		// 결과를 모으는 최종연산
		// collect()
		// 스트림의 결과를 리스트,셋,맵 등으로 모으는 최종연산
		
		// Collectors.toList() : 결과를 리스트로 반환
		words.stream()
			.filter(s -> s.length()>=5)
			.collect(Collectors.toList());
		
		// Collectors.toSet() : 결과를 셋을 반환
		
		// Collectors.toMap(k,v)
		
		// 누적해서 합치기
		// reduce()
		
		int sum = numbers.stream()
					.reduce(0,(a,b)->Integer.max(a, b));
		// 시작값 : 0
		// 1. 시작값이 a로 들어간다
		// 2. 컬렉션의 요소들은 b로 들어간다.
		// 3. 더한 값을 a에 넣는다.
		// 4. 다음 요소를 b에 넣는다.
		// 5. 모든 요소를 순회할 때까지 반복
		System.out.println(sum);
		
		// 누적합
		// 곱셈 누적
		// 최대값/최소값
		// 문자열 연결
		
		// toArray()
		// 스트림 결과를 배열로 반환
		Object[] arr = numbers.stream().toArray();
		
		// 기본형 스트림 전용 최종 연산
		
		// sum()
		sum = IntStream.rangeClosed(1, 5).sum();
		System.out.println("결과 : "+sum);
		
		// average()
		OptionalDouble avg = IntStream.of(10,20,30).average();
		System.out.println("결과2 : "+avg);
		
		// Optional 클래스
		// 자바에서 값이 있을 수도 있고 없을 수도 있는 상황을 안전하게 표현하기 위한 클래스
		// 객체에 값이 들어있지 않으면 NPE 예외 발생
		
		// 값이 들어있지 않으면 기본값을 반환
		double average = avg.orElse(0.0);
		
		// 값이 있을때만 실행
		avg.ifPresent(System.out::println);
		
		// max()
		// 최대값 구하기
		OptionalInt max2 = IntStream.of(7,3,2,9).max();
		
		// System.out.println(max2.getAsInt());
		max2.ifPresent(System.out::println);
		
		// min() 최소값
		OptionalInt min = IntStream.of(7,3,2,9).min();
		min.ifPresent(System.out::println);
	}   
}
