package ex06.thread;

public class MainEntry {
	public static void main(String[] args) {
		
		//Thread t1 = new Thread("t1");
		UserThread t1 = new UserThread("t1");
		Thread t2 = new UserThread("t2");
		Thread t3 = new UserThread("t3");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start(); //run() 유도 된다.
		t2.start();
		t3.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getState());

		
		
	}
}
