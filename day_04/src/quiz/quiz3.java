package quiz;

import java.util.Scanner;

public class quiz3 {
	public static void main(String[] args) {
		//배열 여러개 데티어 중에서 7의 개수 찾기
		int[] a = new int[] { 7, 3, 7, 8, 1, 9, 7, 100, 12, 7, 33, 7 };
	
		
		int sum = 0, cnt = 0;
		int SU = new Scanner(System.in).nextInt();
		int[] arr = new int[SU];
		
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]==7) {
				cnt++;
				sum += a[i];
			}
		}
		
		System.out.println(cnt + "개 합 : " + sum);
	}

}
