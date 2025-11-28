package ex02.lamda;

import java.util.ArrayList;

public class LamdaMain {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(26);
		numbers.add(27);
		numbers.add(30);
		
		numbers.forEach ( (n) -> {System.out.println(n);});
		numbers.forEach ( n -> { System.out.println(n); } );
		
//		System.out.println(numbers);
		
//		for ( int item : numbers) {
//			System.out.println(item);
//		}
	}
}
