package ex2_function;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

// 람다식의 합성 : 여러 함수를 하나의 함수처럼 연결해서 새로운 함수를 만드는 것
// 람다식의 결합 : 함수 실행을 순서대로 이어서 실행
public class FunctionExample {
	public static void main(String[] args) {
		// java에서는 다음 인터페이스에서 합성을 지원한다.
		// Function<T,R>
		// Predicate<T>
		// Consumer<T>
		
		// 핵심 메서드
		
		// andThen()
		// 현재 함수를 실행 -> 다음 함수를 실행한다.
		
		Function<Integer, Integer> multiply = x -> x*2;
		Function<Integer, Integer> add = x -> x + 3;
		
		Function<Integer, Integer> result = multiply.andThen(add);
		System.out.println(result.apply(5));
		
		// compose()
		// 괄호 안의 함수를 실행 -> 앞에 있는 함수를 실행
		
		result = multiply.compose(add);
		System.out.println(result.apply(5));
		
		// Predicate의 결합(조건 합치기)
		Predicate<Integer> isPos = x -> x > 0;
		Predicate<Integer> isEven = x -> x%2 == 0;
		
		// and()
		Predicate<Integer> result2 = isPos.and(isEven);
		
		System.out.println(result2.test(4));
		
		result2 = isPos.negate();
		System.out.println(result2.test(5));
		
		// Consumer<T>
		// 반환값이 없기에 순서대로만 가능
		
		// andthen()
		
		Consumer<String> print1 = s -> System.out.println("1 : "+s);
		Consumer<String> print2 = s -> System.out.println("2 : "+s);
		
		Consumer<String> result3 = print1.andThen(print2);
		
		result3.accept("Hello");
		
		// ... 이런식으로 람다식은 조립이 가능
		
		// 문자열을 입력받아서 다음의 처리를 하는 람다식 함수 파이프라인 만들기
		// 1. 공백 제거 2. 소문자 변환 3. "user_" 접두사 붙이기
		Function<String, String> line1 = str -> str.replace(" ","");
		Function<String, String> line2 = str -> str.toLowerCase();
		Function<String, String> line3 = str -> "user_"+str;
		
		Function<String,String> result4 = line1.andThen(line2).andThen(line3);
		
		System.out.println(result4.apply("a B c D 123"));
	}
}
