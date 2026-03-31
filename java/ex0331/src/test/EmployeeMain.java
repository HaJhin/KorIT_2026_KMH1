package test;

public class EmployeeMain {
	public static void main(String[] args) {
		RegularEmployee re = new RegularEmployee("홍길동", 3000000);
		PartTimeEmployee pte = new PartTimeEmployee("임꺽정", 10000, 48   );
		
		System.out.printf("정규직 %s의 급여 : %d\n",re.getName(),re.getPay());
		System.out.printf("알바생 %s의 급여 : %d\n",pte.getName(),pte.getPay());
	}
}
