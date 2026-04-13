package ex1_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Map은 키(key)와 값(value)을 한 쌍으로 저장하는 자료 구조
// 키(key) : 값(value)를 찾기 위한 이름표 역할

// 키는 중복 X
// 값은 중복 가능

// index가 없고 key를 통해 데이터에 접근
public class MapExample {
		public static void main(String[] args) {
			// Map은 key와 Value의 제네릭 타입을 각각 설정해야 함
			Map<String, Integer> map = new HashMap<String, Integer>();
			
			// map에 데이터를 저장하는 방법
			// put(K k,V v);
			map.put("사과", 1000);
			map.put("바나나", 2000);
			map.put("포도", 1500);
			
			// 내가 넣은 순으로 출력을 보장하지는 않음
			System.out.println(map);
			
			// 저장한 데이터를 꺼내는 방법 : get(key)
			
			int price = map.get("사과");
			
			System.out.println("사과의 가격 : "+ price);
			
			// 데이터 삭제 : remove(key)
			// 삭제하고 난 후 value 값 반환
			int price2 = map.remove("사과");
			System.out.println(map);
			
			// key의 존재 여부 확인 : containsKey(key)
			if (map.containsKey("포도")) System.out.println("존재함");
			
			// value의 존재여부 확인 : containsValue(value)
			if (map.containsValue(1500)) {
				System.out.println("1500원짜리 포도");
			}
			
			// map에 들어있는 데이터의 개수 확인 : size()
			System.out.println("맵의 크기 : "+map.size());
			
			// 컬렉션이 비어있는지 확인 : isEmpty()
			System.out.println("데이터 없는지 여부 : "+map.isEmpty());
			
			// Map에서 전체 데이터를 다루는 방법
			// map에 들어있는 모든 key를 Set으로 반환 : keySet()
			Set<String> set = map.keySet();
			
			// key-value 쌍 전체를 Set<Entry<K,V>> 형태로 반환
			Set<Map.Entry<String, Integer>> set2 = map.entrySet();
			
			for(Map.Entry<String, Integer> entry : set2) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			
			Map<Integer,Character> map2 = new HashMap<Integer, Character>();
			map2.put(1004,'C');
			map2.put(45,'A');
			map2.put(29,'B');
			
			// key가 존재하면 value 반환, 없으면 기본값(default) 반환 메서드
			map2.getOrDefault('C', null);
			// get했을때 key가 없으면 null 반환
			System.out.println(map2.getOrDefault('C', null));
		}
}
