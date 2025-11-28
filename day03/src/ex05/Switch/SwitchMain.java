package ex05.Switch;

import java.util.Scanner;

public class SwitchMain {
	public static void main(String[] args) {
		
		System.out.println( "point = ? (1,2,3)" );
		int point = new Scanner(System.in).nextInt();
		
		switch (point) {
			case 1: System.out.print("집 "); break;
			case 2: System.out.print("피아노 "); break;
			case 3: System.out.print("우산 "); break;
		}
		
		System.out.println("상품에 당첨 되셨습니다.");
	}

}
