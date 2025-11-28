package quiz;

import java.util.Scanner;

// 1. 원하는 단 입력 받아서 구구단 출력하기


public class quiz1 {
	
	public static void main(String[] args) {
		
		System.out.println("출력할 단 입력 : ");
		int i = new Scanner(System.in).nextInt();
		
		for( int j = 1; j <= 9; j++)
			System.out.printf("%d * %d = %d\n",i,j,i*j);
		
	}

}
