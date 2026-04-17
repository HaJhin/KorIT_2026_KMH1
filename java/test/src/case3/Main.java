package case3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee("홍길동", 1000));
		employees.add(new Employee("임꺽정", 2000));
		employees.add(new Employee("장길산", 3000));
		employees.add(new Employee("전우치", 4000));
		
		employees.sort((a,b) -> Integer.compare(b.salary,a.salary));
		System.out.println("== 급여가 높은 순으로 정렬 ==");
		for (Employee e : employees) {
			e.printInfo();
		}
		
		employees.sort((a,b) -> a.name.compareTo(b.name));
		System.out.println("== 이름 오름차순 정렬 ==");
		for (Employee e : employees) {
			e.printInfo();
		}
	}
}
