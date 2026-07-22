package ex0722.coupling;

import ex0722.coupling.CommonCouplingExample.ModuleA;
import ex0722.coupling.CommonCouplingExample.ModuleB;
import ex0722.coupling.ContentCouplingExample.BankAccount;
import ex0722.coupling.ContentCouplingExample.HackerModule;
import ex0722.coupling.ControlCouplingExample.OrderService;
import ex0722.coupling.ExternalCouplingExample.NetworkClient;

public class Main {
	public static void main(String[] args) {
		SquareCalculator calc = new SquareCalculator();
		int result = calc.calculateSquare(5);
		System.out.println(result);
		
		OrderService service = new OrderService();
		double finalPrice = service.calculatePrice(10000, true);
		System.out.println("최종 결제 금액 : " + finalPrice);
		
		NetworkClient client = new NetworkClient();
		client.connect();
		
		ModuleA moduleA = new ModuleA();
		ModuleB moduleB = new ModuleB();
		
		moduleA.updateDiscount(); // 전역 변수의 값을 바꿈
		moduleB.printPrice(100); // 바뀐 전역변수의 영향을 그대로 받는다.
		
		BankAccount account = new BankAccount();
		HackerModule hacker = new HackerModule();
		
		hacker.stealMoney(account); // 상대 객체 내부 잔액을 강제로 조작
	}
}
