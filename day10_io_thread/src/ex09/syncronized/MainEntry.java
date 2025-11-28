/*
package ex09.syncronized;

public class MainEntry {

	public static void main(String[] args) {
		
		String name = Thread.currentThread().getName();
		System.out.println(name);
		long id = Thread.currentThread().getId();
		System.out.println(id);
		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY); //10
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY); //1
		
		Thread.State  state = Thread.currentThread().getState();
		System.out.println(state);
		
		
		int priority = Thread.currentThread().getPriority();
		System.out.println(priority);
	}
}
*/

package ex09.syncronized;

//동기화 테스트 위해 일부러 꼬이게 만든 코드

public class MainEntry {

	public static void main(String[] args) {
		
		Atm at = new Atm(1000);
		UserAtm user1 = new UserAtm(at, "이재민");		
		UserAtm user2 = new UserAtm(at, "김한규");
		UserAtm user3 = new UserAtm(at, "최상규");
		
		user1.start();
		user2.start();
		user3.start();
		
		
		
	}
}
