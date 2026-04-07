package ex3_generic;

public class Main2 {
	public static void main(String[] args) {
		GenEx<String> v1 = new GenEx<String>();
		
		v1.setValue("ABC");
		//System.out.println(v1.getValue());
		
		// 제네릭 타입이 정수인 객체 v2
		GenEx<Integer> v2 = new GenEx<Integer>();
		v2.setValue(13);
		//System.out.println(v2.getValue());
		
		// 제네릭 타입이 문자형인 객체 v3
		GenEx<Character> v3 = new GenEx<Character>();
		v3.setValue('A');
		//System.out.println(v3.getValue());
		
		FruitBox<Fruit> box1 = new FruitBox<Fruit>();
		
		Sample<String> sample = new Sample<String>();
		sample.addElement("This is String", 5);
		System.out.println(sample.getElement(5));
		
		Printer p = new Printer();
		
		// 타입 추론
		// 제네릭 메서드를 호출할 때 전달한 값으로 타입 자동 판단
		p.printValue("ㅎㅇ");
		p.printValue(123);
		p.printValue(3.14);
		
		// 명시적으로도 타입 기입 가능
		p.<String>printValue("ㅎㅇ");
		p.<Integer>printValue(123);
	}
}
