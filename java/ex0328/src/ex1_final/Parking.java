package ex1_final;

public class Parking {
	final int basic= 10000;
	final int extra = 2000;
	
	public int parkingPee(int x) {
		int num = basic + extra*x;
		return num;
	}
}
