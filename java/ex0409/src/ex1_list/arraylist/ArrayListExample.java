package ex1_list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// ArrayList
		// List 인터페이스를 구현한 대표적인 클래스
		// 내부구조 : 배열을 기반으로 동작
		// 장점 : 조회속도가 빠르다(index로 접근하기 때문에)
		// 단점 : 중간 삽입/삭제가 느리다(데이터의 이동이 발생한다.)
		
		// 언제쓰면 좋은가
		// 삽입/삭제는 많지 않지만 조회가 많을때
		
		// java.util 패키지에 들어있다.
		 
		// 구현 클래스의 객체는 해당 인터페이스의 타입 변수에 담을 수 있다.
		List<String> list = new ArrayList<String>();
		
		// 리스트에 데이터 추가하기
		list.add("A");
		list.add("B");
		if (list.add("C")) {
			System.out.println("데이터 추가 성공");
		} else {
			System.out.println("데이터 추가 실패");
		}
		// 내가 원하는 위치에 데이터 넣기
		list.add(1,"데이터");
		// 데이터 값을 바꾸기
		list.set(1,"D");
		// 리스트의 출력
		System.out.println(list);
		// 리스트에 들어있는 데이터를 하나만 꺼내기
		String s = list.get(0);
		System.out.println(s);
		// 연속되지 않은 인덱스에 값을 넣으려고 하면
		// ArrayIndexOutOfBoundException 발생
		
		// 정수타입을 담을 수 있는 List 객체 만들기
		List<Integer> intList = new ArrayList<Integer>();
		
		// 2부터 짝수 데이터 10개 추가하기
		for (int i = 1; i <= 10; i++) {
			intList.add(i*2);
		} // for ed
		System.out.println(intList);
		
		int delNum = intList.remove(3);
		System.out.println(intList);
		System.out.println("삭제된 숫자 : " + delNum);
		
		// 숫자 타입의 데이터는 객체화 후 삭제
		intList.remove(Integer.valueOf(10));
		System.out.println(intList);
		
		// intList에 들어가 있는 모든 10을 삭제하기
		for (int i = 0; i < intList.size(); i++) {
			if (intList.get(i)== 10) intList.remove(i);
		}
		System.out.println(intList);
	} // main ed
} // class ed
