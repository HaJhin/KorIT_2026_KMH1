package test1;

public class Main {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl();
		RemoteControl.Button button = rc.new Button();
		
		//button.press();
		//System.out.println(rc.power);
		
		Calculator cal = new Calculator();
		Calculator.Result add = cal.add(3, 5);
		//add.show();
		
		Car c = new Car();
		
		// 익명 자식 객체가 대입된 필드의 사용
		c.run1();
		
		// 익명 자식 객체가 대입된 로컬변수 사용
		c.run2();
		
		c.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 Tire 객체 3 회전");
			}
		}
		);
		
	}
}
