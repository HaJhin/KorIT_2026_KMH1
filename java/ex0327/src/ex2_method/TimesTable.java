package ex2_method;

public class TimesTable {
	
	public void showTable(int x) {
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n",x,i,x*i);
		}
	}
}
