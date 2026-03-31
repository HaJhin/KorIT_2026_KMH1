package test;

public class PartTimeEmployee extends Employee {
	int hourlyRate;
	int workHours;
	
	public PartTimeEmployee(String name, int hourlyRate, int workHours) {
		super(name);
		this.hourlyRate = hourlyRate;
		this.workHours = workHours;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}
	
	@Override
	public int getPay() {
		return hourlyRate*workHours;
	}
}
