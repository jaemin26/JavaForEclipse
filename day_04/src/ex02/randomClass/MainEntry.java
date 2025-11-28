package ex02.randomClass;

import java.util.Random;

public class MainEntry {
	public static void main(String[] args) {
		
		Random rand = new Random(); //객체생성
		
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextInt());
		
		int num = rand.nextInt();
		System.out.println(num);
		
		System.out.println("------------------");
		System.out.println(rand.nextInt(10)+1);
		
		System.out.println("------------------");
		for(int i = 0; i < 5; i++) {
			System.out.print(rand.nextInt(45) +1 + "\t");
		}
	}

}
