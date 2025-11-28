package ex07.runnable;

public class UserRunnable implements Runnable {
	
	String name;
	
	public UserRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for ( int i = 1; i < 11; i++) {
			
			if ( i == 3 ) {
				try {
					Thread.sleep(3000); // InterruptedException
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
				System.out.println(name);
			}
			System.out.println(i);
		}
		
	}
	

}
