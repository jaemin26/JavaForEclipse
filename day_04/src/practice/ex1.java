package practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ex1 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("자바", "파이썬", "스프링", "장고");
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		//foreach
		for(String s : list) {
			System.out.println(s);
			
		}
		
	}
}
