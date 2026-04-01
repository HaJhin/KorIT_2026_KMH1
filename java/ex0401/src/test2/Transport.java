package test2;

public abstract class Transport {
	String name;
	int baseFare;
	
	public Transport(String name, int baseFare) {
		super();
		this.name = name;
		this.baseFare = baseFare;
	}

	public String showName() {
		return name;
	}
	
	public void printFare(int distance) {
		System.out.println("교통수단 : " + showName());
		System.out.printf("목적지까지의 거리 : %dKM\n",distance);
		System.out.println("총 요금 : " + calculatorFare());
		System.out.println("------------------------");
	}
	
	public abstract int calculatorFare();

	// bus, taxi 클래스 만들고 transport 상속
}
