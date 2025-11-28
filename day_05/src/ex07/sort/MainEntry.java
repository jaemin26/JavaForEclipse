package ex07.sort;

import java.util.Arrays;

public class MainEntry {
	public static void main(String[] args) {
		
		int[] arr = {7, 3, 5, 2, 8};
		
		System.out.println("sort 전 출력");
		
		for (int i = 0; i <arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		System.out.println();
		Arrays.sort(arr);
		
		System.out.println("sort 후 출력");
		
		for (int i = 0; i <arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		System.out.println("\n"+"내림차순으로 출력");
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i]+"\t");
		}
	}

}
