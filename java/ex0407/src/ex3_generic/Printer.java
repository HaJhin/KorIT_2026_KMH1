package ex3_generic;

public class Printer<T> {
	
	public <T> void printValue(T value) {
		System.out.println(value);
	}
	
	public void printAnother(T data) {
		System.out.println(data);
	}
	
	public <T> T getValue(T data) {
		return data;
	}
} // class ed
