//package ex02.lamda;
//
//interface Message{
//	void something(); // void, parameter X
//}
//
//class Person{
//	public void greeting(Message msg) {
//		msg.something();
//	}
//}
//public class MainEntry {
//	public static void main(String[] args) {
//		Person p = new Person();
//		p.greeting(new Message() {
//
//			@Override
//			public void something() {
//				System.out.println("hello");
//			}		
//		});// 일반적인 형태
//		
//		System.out.println("---------------");
//		p.greeting( ()->{
//			System.out.println("hello lamda");
//		} );
//	}
//}
