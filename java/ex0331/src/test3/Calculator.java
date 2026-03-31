package test3;

public sealed class Calculator permits CalPlus,CalMinus{
	public int getResult(int x,int y) {
		return -1;
	}
}
