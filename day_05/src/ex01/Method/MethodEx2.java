package ex01.Method;

public class MethodEx2 {
	
	
	public static String name(int x, String inum) {
		
		System.out.println("x = " + x);
		
		return inum;
		
	}
	
	public static double value(int x, int y, double d) { // return type - double
		return x + y + d; //int
	}
	
	
	public static String display(int x, String name) {
		
//		value(1,2,3.);
//		line();
//		System.out.println(name+x);
//		line();

		for (int i=0; i <= x; i++) {
			System.out.print(name + "\t");
		}
		System.out.println();
		return name + x;
		
	}
	
	public static void line() {
		System.out.println("===========================");
	}
	
	public static void main(String[] args) {
	
		
		display(7,"★" );
		
//		System.out.println(name(10,"jaemin"));
//		
//		String str = name(300, "lee");
//		System.out.println(str);
//		
		
	}

}
