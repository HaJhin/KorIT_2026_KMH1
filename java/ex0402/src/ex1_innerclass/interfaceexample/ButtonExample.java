package ex1_innerclass.interfaceexample;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		Button btnCancle = new Button();
		
		class OkListener implements Button.ClickListener {
			// 추상 메서드 오버라이딩
			@Override
			public void onClick() {
				System.out.println("OK 버튼 클릭");
			}
		}
		
		class CancleListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println("취소 버튼 클릭");
				
			}
			
		}
		
		// setter 호출
		btnOk.setClickListener(new OkListener());
		btnCancle.setClickListener(new CancleListener());
		btnOk.clickBtn();
		btnCancle.clickBtn();
	} // main ed
}
