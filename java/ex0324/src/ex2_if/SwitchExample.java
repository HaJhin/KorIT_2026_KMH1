package ex2_if;

public class SwitchExample {
	public static void main(String[] args) {
		int num = 2;
		switch(num) {	
		case 1:
			System.out.println("1이 나왔습니다.");
			break;
		case 2:
			System.out.println("2가 나왔습니다.");
			break;
		case 3:	
			System.out.println("3이 나왔습니다.");
			break;
		default :
			System.out.println("일치하는 값이 없습니다.");
		} // switch ed
		
		char ch = 'B';
		switch(ch) {	
		case 'A':
			System.out.println("A입니다.");
			break;
		case 'B':
			System.out.println("B입니다.");
			break;
		case 'C':	
			System.out.println("C입니다.");
			break;
		default :
			System.out.println("일치하는 값이 없습니다.");
		} // switch ed
		
		String s = "홍";
		switch(s) {	
		case "김" :
			System.out.println("김길동");
			break;
		case "이" :
			System.out.println("김길동");
			break;
		case "박" :
			System.out.println("김길동");
			break;
		default :
			System.out.println("해당하는 이름 없음");
		} // switch ed
	}
}
