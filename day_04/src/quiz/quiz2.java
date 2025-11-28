package quiz;

import java.util.Scanner;

public class quiz2 {
	
	public static void main(String[] args) {
		
		//임의의 데이터 5개 입력 받아서 출력하는 프로그램
		
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		//System.out.println("5개 숫자 입력 하세요.");
		for(int i = 0; i < arr.length; i++) {
			//arr[i] = sc.nextInt();
			arr[i] = (int)Math.round(10);
		}
		for(int i = 0; i < arr.length; i ++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}

