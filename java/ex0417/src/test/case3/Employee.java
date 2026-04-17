package test.case3;

public class Employee {
	String name;
	int salary;
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public void printInfo() {
		System.out.printf("이름: %s, 급여: %d\n",name,salary);
	}
}
