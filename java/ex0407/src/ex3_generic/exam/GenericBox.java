package ex3_generic.exam;

// 제네릭 타입 T를 사용하는 클래스
// item 필드 1개를 가진다. 타입은 T
// setter로 값 지정
// getter로 값 반환
// Main에서 GenericBox<String>객체에게 사과 저장 후 출력
public class GenericBox<T> {
	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}
