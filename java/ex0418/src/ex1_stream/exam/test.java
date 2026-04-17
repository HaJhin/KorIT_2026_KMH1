package ex1_stream.exam;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class test {
	
	public static class Product{
		String name;
		int price;
		public Product(String name, int price) {
			super();
			this.name = name;
			this.price = price;
		}
	}
	
	public static void main(String[] args) {
		// 주문 금액이 50000원 이상인 주문의 개수를 구하시오.
		List<Integer> orders = Arrays.asList(12000, 80000, 45000, 50000, 99000, 30000);
		
		long count = orders.stream().filter(x -> x>=50000).count();
		System.out.println("5만원 이상 주문의 갯수 : "+count);
		
		//회원 나이 목록이 있을 때 아래를 각각 구하시오.

		// 1. 미성년자가 한 명이라도 있는지
		// 2. 전원이 성인인지
		// 3. 100세 초과 회원이 없는지
		List<Integer> ages = Arrays.asList(21, 35, 17, 42, 63, 15);
		boolean kid = ages.stream().anyMatch(x -> 20>x);
		boolean allAdult = ages.stream().allMatch(x -> x>=20);
		boolean non100 = ages.stream().noneMatch(x -> 100<x);
		System.out.println("1 : "+kid+" 2 : "+allAdult+" 3 : "+non100);
		
		// 정수 리스트에서 짝수만 골라 제곱한 값들의 총합을 구하시오.

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		int totalSum = numbers.stream()
			.filter(x -> x%2==0)
			.mapToInt(x -> x*x)
			.sum();
		System.out.println(totalSum);
		
		// 학생 점수 목록에서 80점 이상인 점수만 내림차순 정렬하여 새로운 리스트로 만드시오.

		List<Integer> scores = Arrays.asList(55, 90, 82, 67, 99, 80, 73);
		
		List<Integer> newScores = scores.stream()
		.sorted((a,b)->b-a).collect(Collectors.toList());
		System.out.println(newScores);
		
		//다음 Product 객체 "리스트"를 이용하여
		//상품명(name)을 key, 가격(price)을 value로 가지는 Map을 생성하시오.

		//단, 가격이 10000원 이상인 상품만 포함하시오.

		List<Product> pList = Arrays.asList(new Product("마우스", 8000),
				new Product("키보드", 30000),
				new Product("모니터", 150000),
				new Product("노트", 2000));
		
		Map<String, Integer> pMap = pList.stream().filter(x->x.price>=10000)
		.collect(Collectors.toMap(a->a.name,b->b.price));
		
		for (java.util.Map.Entry<String,Integer> e : pMap.entrySet()) {
			System.out.println("이름 : "+e.getKey()+" 가격 : "+e.getValue());
		}
	}
}
