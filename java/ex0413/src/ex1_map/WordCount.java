package ex1_map;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) {
		// 단어 빈도수 분석기
		// 문자열을 공백을 기준으로 분리한다
		// 모두 소문자로 바꾼다
		// HashMap<String,Integer>에 단어별 개수를 저장한다.
		Map<String, Integer> map = new HashMap<String, Integer>();
		String text = "Apple banana apple Banana apple";
		String[] splitText = text.toLowerCase().split(" ");
		
		for(int i = 0; i < splitText.length; i++) {
			if (map.containsKey(splitText[i])) {
				map.put(splitText[i],map.get(splitText[i])+1);
			} else {
				map.put(splitText[i], 1);
			}
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ " : " + entry.getValue());
		}
	} // main ed
}
