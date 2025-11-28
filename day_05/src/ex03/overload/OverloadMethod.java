package ex03.overload;

public class OverloadMethod {
	
	public static void line() {
		System.out.println("================");
	}
	
	public static void line(String str) {
		System.out.println(str);
	}
	
	public static void line(double d) {
		System.out.println(d);
	}
	
	public static void line(int x, int y, String str) {
		
		if(x > y) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		for (int i=x; i<=y; i++) {
			System.out.println(str);
		}
		System.err.println();
	}
	
	public static void main(String[] args) {
		
		
		line();
		line(4,0,"kosa");
		line(10,"aba");
		
	}

	public static void line(int n, String str) {
		
		for (int i=0; i<=n; i++) {
			System.out.print(str + " ");
		}
		
	}

}
