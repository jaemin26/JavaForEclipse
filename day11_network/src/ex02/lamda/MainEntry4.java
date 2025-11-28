//package ex02.lamda;
//
//interface Message{
//	int something(int x, int y); // void, parameter X
//}
//
//class Person{
//	public void greeting(Message msg) {
//		int su = msg.something(3, 5);
//		System.out.println("Message interface something : " + su);
//	}
//}
//public class MainEntry4 {
//	public static void main(String[] args) {
//		Person p = new Person();
//		p.greeting(new Message() {
//
//			@Override
//			public int something(int x, int y) {
//				System.out.println("hello444");
//				return x+y;
//			}		
//		});// 일반적인 형태
//		
//		System.out.println("---------------");
//		p.greeting( (x, y) -> { 
//			System.out.println("hello lamda444");
//			return x+y;
//		} );
//	}
//}
