package ex1_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentAvg {
	public static void main(String[] args) {
		// 이름을 key, 점수를 value로 저장
		// 평균, 최고점 학생을 찾는다.
		
		// 평균점수 : XX점
		// 최고점수 학생 : XXX/00점
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("홍길동", 100);
		map.put("임꺽정", 90);
		map.put("장길산", 80);
		
		int total = 0;
		String name = ""; int score = -1;
		for (Entry<String, Integer> entry : map.entrySet()) {
			total += entry.getValue();
			if (entry.getValue() > score) {
				name = entry.getKey();
				score = entry.getValue();
			} // if ed
		} // for ed
		int avg = total/map.size();
	
		System.out.println("평균 점수 : " + avg);
		System.out.printf("%s/%d점",name,score);
		
	} // main ed
} // class ed
