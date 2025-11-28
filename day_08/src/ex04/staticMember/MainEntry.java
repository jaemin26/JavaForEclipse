package ex04.staticMember;

class Atm {
	int count; // instance member
	static int total; // static member - 초기화 1번만.. 있던 값을 가져온다.
	
	public Atm(int amount) { // constructor method
		count += amount;
		total += amount;
	}
	
	public void display() {	
		System.out.println("count : " + count + "  total : " + total);
	}

	//static 메소드에서 일반 멤버변수는 사용할 수 없음
	public static void view() {
		total = total + 100;
		//count = count + 100; error
	}
}

public class MainEntry {
	public static void main(String[] args) {
		
		System.out.println(Atm.total);
		Atm at = new Atm(1000);
		at.display();
		Atm at2 = new Atm(1000);
		Atm at3 = new Atm(1000);
		System.out.println(at3.count);
		System.out.println(at.total);
	}

}
