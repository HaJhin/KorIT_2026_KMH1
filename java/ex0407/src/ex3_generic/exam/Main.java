package ex3_generic.exam;

public class Main {
	public static void main(String[] args) {
		//ArrayPrinter ap = new ArrayPrinter();
		//String[] names = {"홍길동","장길산","임꺽정"};
		
		//ap.printArray(names);
		
		//StudentPrinter sp = new StudentPrinter();
		
		//sp.printStudent("김철수", 15);
		
		GenericBox<String> box1 = new GenericBox<String>();
		box1.setItem("사과");
		System.out.println(box1.getItem());
		GenericBox<Integer> box2 = new GenericBox<Integer>();
		box2.setItem(100);
		System.out.println(box2.getItem());
	}
}
