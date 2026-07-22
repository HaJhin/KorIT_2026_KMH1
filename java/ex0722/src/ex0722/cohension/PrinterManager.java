package ex0722.cohension;

// 논리적 응집도
// - 하나의 메서드/클래스가 너무 많은 역할을 맡게 된다.
// - 새로운 기능이 추가될 때마다 기존 조건문을 계속 수정해야 한다.
// - 호출하는 쪽에서 내부 작동 방식을 잘 알고 파라미터를 정확히 넘겨야 한다.
public class PrinterManager {
	public void processPrinterCommand(String command) {
		if(command.equals("PRINT")) {
			printDocument();
		} else if(command.equals("SCAN")) {
			scanDocument();
		} else if(command.equals("CANCEL")) {
			cancelTask();
		}
	}

	private void printDocument() {
		// TODO Auto-generated method stub
		
	}

	private void scanDocument() {
		// TODO Auto-generated method stub
		
	}

	private void cancelTask() {
		// TODO Auto-generated method stub
		
	}
}
