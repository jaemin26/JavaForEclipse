package ex01.inner;

class OuterClass {
	static int no;
	String message = "hello ~~";
	
	public void outerMethod() {
		System.out.println("outer method call~~~");
	}
	
	class InnerClass{
		int su = 99;
		
		public void show() {
			System.out.println(su); //자기 자신것 접근 가능
			System.out.println(); // 외부접근 가능
		}
		
		public void disp() {
			System.out.println(no); //외부
		}
	}//inner class
}//outer class




public class MainEntry {
	public static void main(String[] args) {
		
		//1.
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.disp();
		ic.show();
		
		System.out.println(" ===================== ");
		
		//2.
		OuterClass.InnerClass inner = new OuterClass().new InnerClass();
		inner.show();
	}

}
