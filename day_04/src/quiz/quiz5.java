package quiz;

import java.util.Scanner;

public class quiz5 {
	public static void main(String[] args) {
		
		int[][] a = new int[2][3];
		int sum = 0;
		//2차원 배열에 임의적인 숫자 입력 받아서 합을 출력해주세요.
		Scanner sc = new Scanner(System.in);
				
		
		System.out.println("배열에 저장할 수 입력 : ");
		for (int i = 0; i < a.length; i++ ) {
			for(int j = 0; j < a[1].length; j++){				
				a[i][j] = sc.nextInt();
				sum += a[i][j];
			}			
		}
		System.out.println("배열 숫자들의 합 : " + sum);
		
	}

}
