package ex1_exception.throwsexample;

public class Account {
	
	private long balance; // 잔액
	
	// Ctor
	public Account() {}

	// 잔액을 반환하는 getter
	public long getBalance() {
		return balance;
	}
	
	// 돈을 전달받아 입금을 하는 메서드 deposit
	public void deposit(int money) {
		balance += money;
		System.out.println("입금 완료");
	}
	
	// 인출
	public void withdraw(int money) throws InsuffcientException {
		if (balance < money) {
			throw new InsuffcientException("잔고 부족 : " + (money-balance));
		}
		balance -= money; 
	}
}
