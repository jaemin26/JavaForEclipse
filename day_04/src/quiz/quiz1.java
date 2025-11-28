package quiz;

import java.util.Random;
import java.util.Scanner;

public class quiz1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int randomInt = (int)(Math.random() *100) + 1;
		System.out.println("수 5회 입력 : ");
		
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			if (randomInt > n) {
				System.out.println("up");
			} else if (randomInt < n) {
				System.out.println("down");
			} else
				System.out.println("great!");
		}
		
		
	}

}
