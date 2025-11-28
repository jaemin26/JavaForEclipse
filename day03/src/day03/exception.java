package day03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception {
	public static void main(String[] args) {
		System.out.println("x, y = ");
		int x, y, result;
		
		try {
		
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			result = x / y;
			System.out.println(result);
		
		}catch(ArithmeticException e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
		
		
	}
}
