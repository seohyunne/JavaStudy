// 이것이 자바다
public class Ex6_19 {
	
	private int balance;
	static int MIN_BALANCE = 0;
	static int MAX_BALANCE = 1000000;

	
	public int setBalance(int money) {
		if(money<MIN_BALANCE || money>MAX_BALANCE) {
			return balance;
		}
		else {
			return balance+=money;
		}

	}
	
	public int getBalance() {
		return balance;
	}
	
	public static void main(String[] args) {
		Ex6_19 account = new Ex6_19();
		
		account.setBalance(10000);
		System.out.println("현재 잔고: "+account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고: "+account.getBalance());
	}

}
