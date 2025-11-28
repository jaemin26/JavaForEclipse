package ex02.wrapper;

class Point{
	
}
public class MainEntry {
	public static void main(String[] args) {
		
		Integer Ia = new Integer(15); //heap memory
		Integer Ib = new Integer("9");
		String su = "30";
		Point pt = new Point();
		
		System.out.println(pt); //주소값
		System.out.println(pt.toString()); //soString override 안하면 주소값
		
		System.out.println(Ia);
		System.out.println(Ib.toString());
		System.out.println(Ib.getClass().getName()+'@'+Integer.toHexString(Ia.hashCode()));
		
		int x = 77; //stack memory
		double y = 5.5;
		System.out.println(x + "," + y);
		x = (int)y; //명시적형변환
		//	y = x; // 묵시적형변환
		
		// Boxing UnBoxing
		int c = Ia.intValue();//jdk 4.x 이전에 사용하던 메소드
		int d = Ib; // jdk 5.x 이후부터 autoBoxing, UnBoxing
		System.out.println(c + ", " + d);
		
		int tt = Integer.parseInt(su)+Ia;
		System.out.println(tt);
		
		
		System.out.println("-----------------------");
		Double dd =12.34;
		c = (int)dd.doubleValue();
		System.out.println(c);
		System.out.println("-----------------------");
		
		int e = Integer.parseInt("123");
		int f = Integer.parseInt("1111111",2);
		System.out.println(f);
		System.out.println(e+20);
	}
}
/*

	 Wrapper class : 기본 자료형에 대응되는 클래스형 자료형
	 기본자료형		클래스형(레퍼런스 또는 참조형)자료형
	 int				Integer
	 float			Float
	 double			Double
	
	 char			Character  ....		


*/