//package ex02.lamda;
//
//interface Message{
//	int something(); // void, parameter X
//}
//
//class Person{
//	public void greeting(Message msg) {
//		int su = msg.something();
//		System.out.println("Message interface something : " + su);
//	}
//}
//public class MainEntry2 {
//	public static void main(String[] args) {
//		Person p = new Person();
//		p.greeting(new Message() {
//
//			@Override
//			public int something() {
//				System.out.println("hello");
//				return 100;
//			}		
//		});// 일반적인 형태
//		
//		System.out.println("---------------");
//		p.greeting( ()->{
//			System.out.println("hello lamda222");
//			return 200;
//		} );
//	}
//}
