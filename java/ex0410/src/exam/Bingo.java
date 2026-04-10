package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bingo {
	public static void main(String[] args) {
		// 1에서 50 사이의 난수가 있다
		// 5 X 5의 빙고 판에 25개의 숫자를 채운다
		// Scanner sc = new Scanner(System.in);
		
		// 무작위 난수 저장 (Set을 통해 중복 제거)
		Set<Integer> set = new HashSet<Integer>();
		while (set.size() < 25) {
			set.add((int)(Math.random()*50)+1); 
		} // while ed
		
		// List로 옮겨담으며 순서 셔플
		List<Integer> number = new ArrayList<Integer>(set);
		Collections.shuffle(number);
		System.out.println(number);
		
		// 빙고판 객체 생성
		List<List<Integer>> bingo = new ArrayList<List<Integer>>();
		
		// 빙고판에 숫자 저장. 5개 저장할 때마다 새로운 오 생성
		for (int i = 0; i < 5; i++) {
			bingo.add(new ArrayList<Integer>());
			for (int j = 0; j < 5; j++) {
				bingo.get(i).add(number.get((i*5)+j));
			} // for ed
		} // for ed
		System.out.println(bingo);
		
		// 출력
		for (Object row : bingo) {
			for (int i : (ArrayList<Integer>)row) {
				System.out.printf("%d\t",i);
			}
			System.out.println();
		}
	}
}
