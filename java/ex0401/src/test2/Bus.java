package test2;

public class Bus extends Transport {
	
	public Bus(String name, int baseFare) {
		super(name, baseFare);
	}

	@Override
	public int calculatorFare() {
		return baseFare;
	}
} // ed
