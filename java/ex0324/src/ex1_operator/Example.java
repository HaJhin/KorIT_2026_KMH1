package ex1_operator;
import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 상자 하나에는 농구공이 5개가 들어갈 수 있다.
		// 만일 농구공이 23개라면 몇개의 상자가 필요한가.
		/*// 1
		int ball = sc.nextInt();
		int boxInput = 5;
		int box = (ball / boxInput == 0) ? (ball / boxInput) : (ball / boxInput + 1);
		System.out.println(box);
		*/
		/*// 2
		int h = sc.nextInt();
		int v = sc.nextInt();
		int e = h*v;
		int c = (h+v)*2;
		System.out.printf("넓이는 %d, 둘레는 %d", e,c);
		*/
		// 학생은 하루에 일정한 금액의 용돈을 받는다.
		// 하루에 받는 용돈 : money
		// 날짜 수 : day
		// 총 받은 용돈에서 사용한 금액 used를 뺀 남은 돈을 출력하는 코드 작성하기
		// 각 값들은 키보드에서 입력받는다.
		/* // 3
		int money = sc.nextInt();
		System.out.println("용돈 : " + money);
		int day = sc.nextInt();
		System.out.println("지난 날짜 : " + day);
		int used = sc.nextInt();
		System.out.println("사용한 금액 :" + used);
		int charge = money*day - used;
		if (charge > 0) {
			System.out.printf("남은 돈은 %d원.\n",charge);
		} else {
			System.out.println("예산 초과입니다.");
		}
		*/
		// 국어 영어 수학 점수 입력
		// 평균 출력
		// 세과목 점수가 각각 60 이상이고, 평균이 60점 이상일때 합격
		int korean = sc.nextInt();
		System.out.println("Korean :" + korean);
		int english = sc.nextInt();
		System.out.println("english :" + english);
		int math = sc.nextInt();
		System.out.println("math :" + math);
		int average = (korean+english+math)/3;
		System.out.println("평균 점수 : " + average);
		boolean pass = (korean>=60 && english>=60 && math>=60 && average>=60) ? true : false;
		if (pass) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
}
