package ex4_continue;

public class ContinueExample {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i ++) {
			if (i % 3 == 0) continue;
			System.out.print(i+" ");
		}
		String name = "민형";
		System.out.println(System.identityHashCode(name));
	} // main ed
} // class ed
