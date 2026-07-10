package com.example.demo.di2;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

class Car{};
class SportCar extends Car{};
class Truck extends Car{}; 
class Engine{};

// ApplicationContext
// Spring이 객체를 저장하는 창고(컨테이너)

class AppContext{
	Map map; // 객체를 선언할 map 선언
	
	// AppContext 객체가 만들어질 때 HashMap이 같이 만들어진다.
	public AppContext() {
		try {
			Properties p = new Properties();
			p.load(new FileReader("config.txt"));
			
			// Properties에 저장한 내용을 Map에 저장한 채로 시작
			map = new HashMap(p);
			
			for(Object key : map.keySet()) {
				Class clazz = Class.forName((String)map.get(key));
				map.put(key, clazz.newInstance());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // Ctor ed
	
	// 메서드
	Object getBean(String key) {
		return map.get(key);
	} // method ed
} // AppContext ed

public class Main2 {
	public static void main(String[] args) {
		AppContext ac = new AppContext();
		
		Car car = (Car)ac.getBean("car");
		Engine engine = (Engine)ac.getBean("engine");
	}
}
