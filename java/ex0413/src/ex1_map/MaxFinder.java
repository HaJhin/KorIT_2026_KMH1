package ex1_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MaxFinder {
	public static void main(String[] args) {
		int[] arr = {1,3,2,3,4,3,2,2,2,4,4,4,4,4};
		int max = 0;
		int maxNum = -1;
		// 숫자별 등장 횟수를 HashMap<Integer,Integer>로 찾기
		// 가장 빈도수가 큰 숫자 찾기
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int num : arr) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			} else {
				map.put(num, 1);
			}
		} // for ed
		
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxNum) {
				max = entry.getKey();
				maxNum = entry.getValue();
			}
		} // for ed
		
		System.out.printf("최다등장 숫자 : %d / 등장 횟수 : %d",max,maxNum);
	}
}
