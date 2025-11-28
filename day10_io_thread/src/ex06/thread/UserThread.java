package ex06.thread;

public class UserThread extends Thread {
	
	String name;

	public UserThread(String name) {
		this.name = name;
	}

	@Override
	public void run() { // 스레드 실행부(구현부)
		//System.out.println("UserThread run() call " + name);
		for ( int i = 1; i < 11; i++) {
			
			if ( i == 3 ) {
				try {
					sleep(3000); // InterruptedException
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
				System.out.println(name);
			}
			System.out.println(i);
		}
	}
	
	

}
