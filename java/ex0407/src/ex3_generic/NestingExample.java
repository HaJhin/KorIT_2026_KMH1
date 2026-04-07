package ex3_generic;

class Pair<T,U> {
	private T first;
	private U second;
	
	public Pair(T first,U second) {
		this.first = first;
		this.second = second;
	}
	
	public void print() {
		System.out.println("first : " + first);
		System.out.println("second : " + second);
	}
}

class Box<V> {
	private V value;
	
	public void setValue(V value) {
		this.value = value;
	}
	
	public V getValue() {
		return value;
	}

}

public class NestingExample {
	public static void main(String[] args) {
		Box<Pair<String,Integer>> box = new Box();
		Pair<String,Integer> pair = new Pair<>("홍길동",10);
		box.setValue(pair);
		box.getValue().print();
	}
}
