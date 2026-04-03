package ex1_innerclass.hiddenclass;

public class ButtonExample {
	public static void main(String[] args) {
		// 메서드에 매개변수로 전달하는 방식을 이용하여 이벤트 처리
		Button btnOk = new Button();
		Button btnCancel = new Button();
		Button btnAdd = new Button();
		
		btnOk.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("OK 버튼");
			}
		}); // btnOk setCL ed
		
		btnCancel.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("취소 버튼");
			}
		}); // btnCancel setCL ed
		
		//btnOk.click();
		//btnCancel.click();
		
		Calculator cal = new Calculator() {
			
			@Override
			public void add(int x, int y) {
				System.out.println("두 수의 합 : " + (x+y));
			}
		};
		
		cal.add(3, 2);
	} // main ed
}
