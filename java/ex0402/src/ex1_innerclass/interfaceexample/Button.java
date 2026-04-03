package ex1_innerclass.interfaceexample;

public class Button {
	
	// static 없어도 static 처리
	// 중첩 interface는 무조건 static이다.
	public static interface ClickListener {
		void onClick(); // 추상메서드
	}
	
	// 필드
	private ClickListener clickListener;

	// setter
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	// 버튼이 클릭되었을때 실행할 메서드로 click() 메서드 추가하기
	// 실행내용은 ClickListener 인터페이스 필드를 이용해 onClick 추상 메서드 호출
	
	public void clickBtn() {
		clickListener.onClick();
	}

} // Button ed

