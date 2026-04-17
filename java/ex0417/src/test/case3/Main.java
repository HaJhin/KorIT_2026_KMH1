package test.case3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("홍길동", 1000));
		employeeList.add(new Employee("임꺽정", 2000));
		employeeList.add(new Employee("장길산", 3000));
		employeeList.add(new Employee("전우치", 4000));
		
		employeeList.sort((a,b)-> Integer.compare(b.salary,a.salary));
		
		System.out.println("== 급여 높은 순 정렬 ==");
		for (Employee e : employeeList) {
			e.printInfo();
		}
		
		employeeList.sort((a,b)-> a.name.compareTo(b.name));
		
		System.out.println("== 이름 오름차순 정렬 ==");
		for (Employee e : employeeList) {
			e.printInfo();
		}
	}
}
