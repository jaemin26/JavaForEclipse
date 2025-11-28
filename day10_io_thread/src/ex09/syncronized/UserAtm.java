package ex09.syncronized;

public class UserAtm extends Thread {
	
	Atm obj;
	boolean flag = false;
	
	public UserAtm(Atm obj, String name) {//상속받은 Thread에 String 받는 생성자함수 있음
		super(name);
		this.obj = obj;
	}
	@Override
	public void run() { // 스레드 실행부(구현부)
		
		for ( int i = 0; i < 2; i++) {
			try {
				sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if ( flag ) {
				obj.deposit( (int)(Math.random() * 10 + 2) * 100, getName());
			} else {
				obj.withdraw( (int)(Math.random() * 10 + 2) * 100, getName());
			}
			
			flag = true;
			obj.getMoney();
		}
		
	}
}
