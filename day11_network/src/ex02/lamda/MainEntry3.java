//package ex02.lamda;
//
//interface Message{
//	int something(int x); // void, parameter X
//}
//
//class Person{
//	public void greeting(Message msg) {
//		int su= msg.something(10);
//		System.out.println("Message interface something : " + su);
//	}
//}
//public class MainEntry3 {
//	public static void main(String[] args) {
//		Person p = new Person();
//		p.greeting(new Message() {
//
//			@Override
//			public int something(int x) {
//				System.out.println("hello333");
//				return x;
//			}		
//		});// 일반적인 형태
//		
//		System.out.println("---------------");
//		p.greeting( x->{ //lamda 형태에서 자료형 안 써도 되고, 매개변수 1개면 괄호 생략가능 
//			System.out.println("hello lamda333");
//			return x;
//		} );
//	}
//}
