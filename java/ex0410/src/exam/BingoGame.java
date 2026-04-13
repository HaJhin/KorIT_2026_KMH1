package exam;

import java.util.Scanner;

public class BingoGame {
	private Bingo board;
	private Scanner sc;
	
	public BingoGame() {
		board = new Bingo();
		sc = new Scanner(System.in);
	} // Ctor ed
	
	// Start() 메서드를 작성하여 게임 전체 흐름 구현
	// 게임 시작 시 빙고 게임 시작 문구 출력 
	// 반복문을 통해 숫자를 계속 입력받을 수 있도록 하기
	public void Start() {
		System.out.println("=== 게임 시작 ===");
		while (true) {
			System.out.print("지울 숫자 입력 : ");
			int number = sc.nextInt();
			if(board.markNumber(number)) System.out.println("마킹 성공");
			else System.out.println("존재하지 않는 수입니다.");
			System.out.println("현재 빙고 갯수 : " + board.countBingo());
			if (board.countBingo() >= 3) {
				System.out.println("!+!+! 3빙고 완성! 게임 종료 !+!+!");
				break;
			}
			board.printBoard();
		}
	}
	// 1단계 : 현재 빙고판 출력
	// 2단계 : 사용자에게 숫자 입력 받음
	// 3단계 : 입력한 숫자가 빙고판에 존재하면 체크 처리
	// 4단계 : 숫자가 존재한다면 X를 체크했습니다 출력
	// 5단계 : 숫자가 빙고판에 없으면 "빙고판에 없는 숫자입니다" 출력
}
