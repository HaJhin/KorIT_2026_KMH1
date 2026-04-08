package ex1_generic;

public class CalMain {
	public static void main(String[] args) {
		// 제네릭에 타입을 넣는건 좋아... 아무거나 다 들어가네?
		Calculator<Number> cal1 = new Calculator<Number>();
		Calculator<Integer> cal2 = new Calculator<Integer>();
		Calculator<Double> cal3 = new Calculator<Double>();
		Calculator<Float> cal4 = new Calculator<Float>();
		
		// 어떤 기능을 만들 때는
		// 특정 성질을 가진 타입만 받아야 안전하다는 문제가 생김
		
		// 제네릭에 넣을 수 있는 타입의 범위를 한정
		
		// 1. 잘못된 타입을 막을 수 있다
		// 2. 상위타입의 기능 사용 가능
		
		AnimalHospital<Dog> dogHospital = new AnimalHospital<Dog>(new Dog());
		AnimalHospital<Cat> catHospital = new AnimalHospital<Cat>(new Cat());
		
		// 동물병원은 동물만 다루는 곳인데
		// 문자열이나 숫자,다른 객체가 들어오면 이상해짐
		dogHospital.treat();
		catHospital.treat();
		
		DeviceManager<TV> tvManager = new DeviceManager<TV>(new TV());
		DeviceManager<Audio> audioManager = new DeviceManager<Audio>(new Audio());
		tvManager.powerOn();
		audioManager.powerOn();
		
	}
}
