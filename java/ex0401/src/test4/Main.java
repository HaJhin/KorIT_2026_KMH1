package test4;

public class Main {
	public static void main(String[] args) {
		Button btn1 = new Button();
		Button btn2 = new Button();
		
		btn1.setListener(new LoginListener());
		btn2.setListener(new LogoutListener());
		
		btn1.click();
		btn2.click();
	}
}
