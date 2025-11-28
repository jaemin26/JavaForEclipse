package quiz;

import java.util.Scanner;

public class Quiz_ex02 {
	public static void main(String[] args) {
		
		//Scanner, if
		//정수 입력 받아서 짝수/홀수 판정 프로그램
		int i;
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		
		if(i%2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
	}

}
