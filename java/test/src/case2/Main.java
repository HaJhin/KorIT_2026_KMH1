package case2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Product p = new Product("사과", 5);
		
		p.printInfo();
		p.sell(3);
		p.printInfo();
		p.sell(10);
		p.printInfo();
		
	} // main ed
} // class ed
