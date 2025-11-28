package ex01.Instanceof;

class A { int a; }
class B extends A { int b;}

public class MainEntry {
	
	public static void main(String[] args) {
		
		A a = new A();
		
		B b = new B();
		A bb = new B();
		
		System.out.println("a instanceof A : "  + (a instanceof A));
		System.out.println("b instanceof A : "  + (b instanceof A));
		System.out.println("a instanceof B : "  + (a instanceof B)); //false 자식 인스턴스로 부모객체 생성못함
		System.out.println("b instanceof B : "  + (b instanceof B));
		
	}

}
