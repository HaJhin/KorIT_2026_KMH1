package ex3_generic.exam;

public class Main {
	public static void main(String[] args) {
		ArrayPrinter ap = new ArrayPrinter();
		String[] names = {"홍길동","장길산","임꺽정"};
		
		ap.printArray(names);
		
		StudentPrinter sp = new StudentPrinter();
		
		sp.printStudent("김철수", 15);
	}
}
