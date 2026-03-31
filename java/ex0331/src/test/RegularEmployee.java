package test;

public class RegularEmployee extends Employee{
	int salary;

	public RegularEmployee(String name, int salary) {
		super(name);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public int getPay() {
		return salary;
	}
}
