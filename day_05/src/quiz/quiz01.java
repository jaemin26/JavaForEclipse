package quiz;

import java.util.Scanner;

public class quiz01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			int choice, a, b;
			
			System.out.println("두 수를 입력하세요.");
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.print("선택 ? 1.+ 2.- 3.* 4./ 0.exit");
			choice = sc.nextInt();
			
			
			switch(choice){
			case 1:
				add(a,b); break;
			case 2:
				sub(a,b); break;
			case 3:
				mul(a,b); break;
			case 4:
				div(a,b); break;
			case 0:
				System.exit(0);
			}
		
		}

	}
	

	//add, sub, mul() - return, div(x,y) or div-return
	
	public static void add(int x, int y) {
		
		System.out.println(x+y);
		
	}
	
	public static void sub(int x, int y) {
		
		System.out.println(x-y);
	}
	
	
	public static void max(int x, int y) {
		
		int max = (x > y) ? x : y;
		
		System.out.println("max ? " + max);
	}
	
	public static void mul(int x, int y) {
		
		System.out.println(x*y);
		
	}
	
	public static void div(int x, int y) {
		
		double result =0 ;
		
		try { 			
			result = x/y;
			System.out.println(result);
			
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
								
			}	
		
	}

}
