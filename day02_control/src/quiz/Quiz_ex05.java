package quiz;

import java.util.Scanner;
import java.util.Arrays;

public class Quiz_ex05 {
	public static void main(String[] args) {
		
		int[] intArr;
		int su = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇개의 수 입력 ? : ");
		su = sc.nextInt();
		intArr = new int[su];
		System.out.println("입력하세요");
		
		for (int i = 0; i <su; i++)
			intArr[i]=sc.nextInt();	
		
		Arrays.sort(intArr);
		System.out.println("재배열 합니다.");
		
		for (int i = 0; i < su; i++)
			System.out.print(intArr[i] + " ");	
		
		System.out.println(intArr.length);
		
		
	}

}
