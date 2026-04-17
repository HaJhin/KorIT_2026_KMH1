package ex1_stream.exam;

import java.util.Arrays;
import java.util.List;

public class Example {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3,4,56,7,5,23,3,6,34,56,34,2);
		
		// 짝수만 골라 10을 더한 뒤 출력
		
		numbers.stream()
		.filter(x -> x%2==0)
		.map(x -> x+10)
		.forEach(x -> System.out.print(x + " "));
		
		List<String> words = Arrays.asList("java","spring","react");
		
		// 문자열의 길이가 5이상인 문자열만 남긴 뒤 대문자로 변환해서 출력
		System.out.println();
		words.stream()
		.filter(s -> s.length() >= 5)
		.map(String::toUpperCase)
		.forEach(x -> System.out.print(x + " "));
	}
}
