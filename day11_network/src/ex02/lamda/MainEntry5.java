package ex02.lamda;

@FunctionalInterface //인터페이스가 하나의 메소드만 가지고 있을 때
interface Message{
	void something(int x, int y); // void, parameter X
}
@FunctionalInterface
interface Talk{
	void something(String x, String y);
}

class Person{
	public void greeting(Message msg) {
		msg.something(3, 5);
	}
	public void greeting(Talk msg) {
		msg.something("Hello", "Java");
	}
}
public class MainEntry5 {
	public static void main(String[] args) {
		Person p = new Person();
		char ch = 'K';
		
		//p.greeting( (x,y) -> { //에러발생, 타입을 정확히 써줘야 함
		p.greeting( (String x, String y) -> {
			System.out.println("hello lamda");
			System.out.println(x + y);
			num = 90;//static 변수값은 람다 안에서도 변경 가능
//			ch = 'k'; 람다 안에서 일반형식의 값 변경 못함
			System.out.println(num);
		} );
		
	}
	
	static int num = 50;
}
