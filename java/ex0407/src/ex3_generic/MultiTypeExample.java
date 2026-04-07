package ex3_generic;

class PairBox<T,U> {
	private T first;
	private U second;
	
	public void set(T first, U second) {
		this.first = first;
		this.second = second;
	} // set ed

	public T getFirst() {
		return first;
	}

	public U getSecond() {
		return second;
	}	
} // PairBox ed

public class MultiTypeExample {
	public static void main(String[] args) {
		PairBox<String,Integer> box1 = new PairBox();
		box1.set("홍길동", 13);
		System.out.println(box1.getFirst());
		System.out.println(box1.getSecond());
		
		PairBox<String,Double> box2 = new PairBox();
		box2.set("임꺽정", 3.14);
		System.out.println(box2.getFirst());
		System.out.println(box2.getSecond());
	}
}
