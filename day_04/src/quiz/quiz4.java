package quiz;

import java.util.Scanner;

public class quiz4 {
	public static void main(String[] args) {
		
		
		int TMP = 5;
		
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("강수량 수집할 일자 입력 : ");
		TMP = sc.nextInt();
		double[] rain = new double[TMP];
		
		System.out.printf("%d일 강수량 입력 \n",TMP);
		for (int i = 0; i < rain.length; i++)
		{
			rain[i] = sc.nextDouble();
			sum += rain[i];
		}
		
		System.out.printf("%d일 강수량 평균 : %f",rain.length, sum/rain.length);
		
	}

}


/*

기상청 근무
 특정달(30일 기준) 강수량 평균 구하는 프로그램 작성?

 1.2
 0 
 10.

*/