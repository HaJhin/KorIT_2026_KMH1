package ex3_generic;

// 클래스에 제네릭을 부여하게 되면 해당 클래스를 선언할 때 데이터 타입을 부여하게 된다.
public class GenericExample<T> {
	private Object[] data;
	private int size;
	private int defaultSize = 10;
	
	public GenericExample() {
		super();
		data = new Object[defaultSize];
	}

	public GenericExample(int size) {
		super();
		data = new Object[size];
	}

	// 값을 받아 배열에 순차적으로 넣는 add 메서드
	public void addArr(Object obj) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == null) {data[i] = obj; break;}
			else continue;
		} // for ed
	} // addArr ed
	
	public void addArr2(T value) {
		data[size++] = value;
	}
	
	// 인덱스를 받아 그 인덱스의 값을 반환하는 get 메서드
	public T getArr(int index) {
		return (T)data[index];
	} // getArr ed
	
	// 배열에 데이터가 몇개 들어가있는지 확인하는 size 메서드
	public void sizeArr() {
		int size = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] != null) size++; 
		} // for ed
		System.out.println("배열의 최대 사이즈 : "+data.length);
		System.out.println("배열 안에 저장된 데이터의 수 : "+size);
	}
	
	public int sizeArr2() {
		if (size == 0) return defaultSize;
		else return size;
	}
}
