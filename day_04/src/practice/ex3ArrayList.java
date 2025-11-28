package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex3ArrayList {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		System.out.println(list);
		
		Collections.addAll(list,1,2,3,4,5,9);
		System.out.println("addAll(list, 1,2,3,4,5,9) = " +list);
		
		Collections.rotate(list,3);// 오른쪽3칸
		System.out.println("rotate(list,3) = " + list);
		
		Collections.swap(list, 0, 2);
		System.out.println("swap(list, 0, 2) = " + list);
		
		Collections.shuffle(list);
		System.out.println("shuffle(list) = " + list);
		
		System.out.println("max(list) = " + Collections.max(list));
		System.out.println("min(list) = " + Collections.min(list));
	}

}
