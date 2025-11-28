package quiz;

import java.util.Scanner;

public class Quiz_ex03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.print("연도 입력 : ");
		year = sc.nextInt();
		
		if( year % 4 == 0 ) {
			if(year % 100 == 0) {
				System.out.println("평년");
				return;
			}
				
			if( (year % 100 != 0) || ( year % 400 == 0 )) 
				System.out.println("윤년");
		}
		else if( year != 0)
			System.out.println("평년");
		
	}

}
