package ex2_function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

// 메서드를 만들 때 발생하는 다양한 경우의 수를 인터페이스로 설계
// 매번 인터페이스로 만들어야 하는 귀찮음이 줄어듦
public class Main {
	public static void main(String[] args) {
		// Cosumer<T>
		// 값을 하나 받아서 소비만 하는 인터페이스
		// 즉 입력은 있지만 반환값은 없음
		// void accept(T t);
		
		Consumer<String> consumer = str -> System.out.println("출력 : "+str);
		// consumer.accept("안녕");
		// consumer.accept("JAVA");
		
		List<String> fruits = Arrays.asList("사과","바나나","포도");
		
		// 과일 1개를 출력하는 람다식 만들기
		
		Consumer<String> fruitCons = fruit -> System.out.println(fruit);
		
		
		// 리스트에 들어있는 모든 내용을 람다식을 이용해 출력
		for (String fruit : fruits) {
			// fruitCons.accept(fruit);
		}
		
		// Supplier<T>
		// 값을 만들어서 공급하는 인터페이스
		// 입력은 없고, 반환값만 있다
		// T get()
		
		Supplier<String> supplier = () -> "안녕하세요";
		// System.out.println(supplier.get());
		
		// 랜덤 주사위 람다식
		Supplier<Integer> randomDice = () -> (int)(Math.random()*6)+1;
		
		// System.out.println(randomDice.get());
		
		// 랜덤값 생성
		// 기본값 생성
		// 객체 생성
		// 지연 생성
		
		// 즉시 객체를 생성
		// 실행하면 무조건 객체가 만들어진다
		ExpensiveObject obj = new ExpensiveObject();
		
		// supplier로 선언을 한다고 해서 객체가 만들어지는 것은 아님
		Supplier<ExpensiveObject> supplier2 = () -> new ExpensiveObject();
		
		// 필요할 때 get()을 호출해 객체 생성
		supplier2.get();
		
		// Function<T,R>
		// 입력값을 받아서 다른 결과값으로 변환하는 인터페이스
		// R apply(T t)
		
		// 문자열 길이 구하기
		Function<String, Integer> lengthFunction = str -> str.length();
		
		// System.out.println(lengthFunction.apply("Hello"));
		// System.out.println(lengthFunction.apply("JAVA"));
		
		// numbers에 들어있는 모든 요소에 2를 곱해 result에 넣기
		
		Function<Integer, Integer> twoTime = number -> number*2;
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		List<Integer> result = new ArrayList<Integer>();
		
		for (int i : numbers) {
			result.add(twoTime.apply(i));
		}
		// System.out.println(result);
		
		// Predicate<T>
		// 값을 받아 조건을 검사한 뒤 true/false를 반환하는 메서드
		// boolean test(T t);
		
		// 필터링, 유효성 검사, 조건 분기 , 검색 조건
		
		// BiConsumer<T,U>
		// 값을 두 개 받아서 소비만 한다.
		// void accept(T t, U u);
		
		BiConsumer<String, Integer> printUser =
				(name,age) -> System.out.println("이름 : "+name+" / 나이 : "+age);
		
		printUser.accept("김철수", 20);
		
		// BiPredicate<T,U>
		// 값을 두 개 받아서 조건 검사 후 t/f
		// boolean test(T t,U u)
		// BiPredicate<String, Integer> 
	}
}
