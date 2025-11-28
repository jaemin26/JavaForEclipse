package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ex2ArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("C","B","A","a","F"));
		
		System.out.println("list : " +list);
		
		
		//오름차순
		Collections.sort(list);
		System.out.println("list 오름차순 : " + list);
//		Collections.reverse(list);
//		System.out.println(list);
	
		
		//내림차순
		Collections.sort(list , Collections.reverseOrder());
		System.out.println("list 내림차순 : " + list);
		
		//대소문자 구분없이 오름차순
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		System.out.println("list 대소문자 구분없이 오름차순 : " + list);
		
		//대소문자 구분없이 내림차순
		Collections.sort(list, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
		System.out.println("list 대소문자 구분없이 내림차순 : " + list);
		
		
	
	}

}

  
 