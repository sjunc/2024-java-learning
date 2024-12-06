package week13.ch11.sec06;

public class Account {
	private long balance;
	
	public Account() { }
	
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws InsufficientException{
		if(balance <money) {
			throw new InsufficientException("exchange not enough: " + (money - balance)+ " you need");
		}
		balance -=money;
	}

}
