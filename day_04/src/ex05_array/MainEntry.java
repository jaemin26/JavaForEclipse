package ex05_array;

import java.util.Random;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		int[][][] arr = new int[2][3][4];
		
//		System.out.println(arr.length);// 면의 크기
//		System.out.println(arr[0].length); //행크기
//		System.out.println(arr[0][0].length);// 열크기
	
		System.out.println("================================");
		//임의적인 데이터 입력 받아서 입력된 데이터 값 출력하는 프로그램(3차원 배열)
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i < arr.length; i++) {
			for (int j=0; j < arr[0].length; j++) {
				for (int k=0; k <arr[0][0].length; k++) {
					arr[i][j][k] = new Random().nextInt(100);
				}
			}
		}
		
		for (int i=0; i < arr.length; i++) {
			System.out.printf("%d면-------\n",i+1);
			for (int j=0; j < arr[0].length; j++) {
				
				for (int k=0; k <arr[0][0].length; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
		}
	}

}
