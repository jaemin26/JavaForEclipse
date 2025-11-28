package ex09.syncronized;

public class Atm {
	private int money;
	
	public Atm(int money) {
		this.money = money;
	}
	
	//입금함수
	public void deposit(int amount, String name) {
		money += amount;
		System.out.println(name + "입금금액" + amount);
	}
	
	//출금함수
	public void withdraw(int amount, String name) {
		synchronized (this) {
			
			if ( (money - amount) > 0) {
				
				Thread.yield();
				
				money -= amount;
				System.out.println(name + "출금금액" + amount);
			} else {
				System.out.println(name + "잔액부족");
			}
			
		}
		
		
	}
	
	//조회함수
	
	public void getMoney() {
		
		System.out.println("            잔액 : " + money);
		
	}
}
