package ex03.overload;


//overload 중복함수
public class MainEntry {
	
	public static void plus(int x, int y) {
		System.out.println(x + y);
	}
	
	public static void plus(double x, double y) {
		System.out.println(x + y);
	}
	public static void plus(int x, int y, int z) {
		System.out.println(x + y+ z);
	}
	
	public static void main(String[] args) {
		
		plus(1.3,2);
		plus(10,20,30);
	}

}
