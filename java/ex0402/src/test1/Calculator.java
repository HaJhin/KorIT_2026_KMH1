package test1;

public class Calculator {
	Result result;
	
	Result add(int a,int b) {
		return new Result(a+b);
	}
	
	
	static class Result {
		int value;

		public Result(int value) {
			super();
			this.value = value;
		}
		
		void show() {
			System.out.println("결과 : " + value);
		}
	} // result
	
} // ed
