package ex2_object;

public class MemberMain {
	public static void main(String[] args) {
		Product[] products = {
				new Product("사과", 1000, 1),
				new Product("바나나", 1500, 2),
				new Product("포도", 2000, 3)
		}; // products ed
		
		for (Product product : products) {
			// System.out.println(product.toString());
		}
		
		Member[] members = {
				new Member("1", "김"),
				new Member("1", "김"),
				new Member("1", "박")
		};
		
		//System.out.println(members[0].equals(members[1]));
		//System.out.println(members[0].equals(members[2]));
		
		Object[] arr = {"Java",100,3.14,new Employee("홍길동", "개발팀")};
		
		// 반복문으로 배열 순회
		// 타입에 따라 출력 양식 변경
		
		for (Object obj : arr) {
			if(obj instanceof String) System.out.println("문자열 객체 : "+obj);
			if(obj instanceof Integer) System.out.println("정수 객체 : "+obj);
			if(obj instanceof Double) System.out.println("실수 객체 : "+obj);
			if(obj instanceof Employee) {
				System.out.println("이름 : "+((Employee) obj).getName());
				System.out.println("부서 : "+((Employee) obj).getDept());
			}
		}
	}
}
