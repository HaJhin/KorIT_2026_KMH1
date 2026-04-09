package ex1_list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExample3 {
	public static void main(String[] args) {
		// 문자열 타입 리스트 객체 생성
		// 리스트에 문자 저장
		// 각 문자열의 길이를 계산하여 lengths라는 새로운 리스트 만들어서 저장
		// lengths 리스트 출력
		
		List<String> listS = Arrays.asList("Java","Spring","HTML","CSS");
		List<Integer> lengths = new ArrayList<Integer>();
		for (String str : listS) {
			int i = str.length();
			lengths.add(i);
		}
		//System.out.println("문자열 : "+ listS);
		//System.out.println("각 문자열의 길이 :   " + lengths);
		
		// 문자열 형태의 리스트 생성
		// "김철수","이영희","김철수","박민수","김철수"
		// 리스트에서 김철수 몇번 들어가있는지 계산
		List<String> list2 = Arrays.asList("김철수","이영희","김철수","박민수","김철수");
		int totalName = 0;
		for (int i = 0; i < list2.size(); i++) {
			if (list2.get(i) == "김철수") totalName++;
		}
		//System.out.println(list2);
		//System.out.println("김철수의 수 : " + totalName);
		
		// score 정수타입 리스트
		// 88,72,95,60,81
		// 최고점과 최저점을 찾아서 차이 출력
		List<Integer> list3 = Arrays.asList(88,72,95,60,81);
		int maxNum = list3.get(0);
		int minNum = list3.get(0);
		
		
		
		System.out.println(list3);
		System.out.println("최고점 : "+maxNum);
		System.out.println("최저점 : "+minNum);
		System.out.println("최고점과 최저점의 차이 : "+(maxNum-minNum));
	}
}
