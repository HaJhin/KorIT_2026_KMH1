package ex1_reflection.member;

public class Car {
	private String model;
	private String owner;
	
	public Car(String model, String owner) {
		super();
		this.model = model;
		this.owner = owner;
	}

	public Car(String model) {
		super();
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

} // class ed
