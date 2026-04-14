package ex1_lambda;

public class Main {
	public static void main(String[] args) {
		CalculatorService cs =new CalculatorService();
		
		Calculator c = (a,b) -> a+b;
		
		cs.execute(c);
		
		Calculator add = cs.getCalculator("add");
		Calculator sub = cs.getCalculator("sub");
		
		System.out.println(add.calc(2, 4));
		System.out.println(sub.calc(7, 5));
		
		
	}
	
}
