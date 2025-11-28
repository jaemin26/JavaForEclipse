package ex03.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList<>(10);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(10);
		
		ArrayList list2 = new ArrayList<>(list.subList(1, 4)); //상한포함 하한미포함
		//System.out.println("list.containsAll : " + list.containsAll(list2));
		print(list, list2);
		
		list2.add(33);
		print(list, list2);
		
		Collections.sort(list);
		Collections.sort(list2);
		print(list, list2);
		System.out.println("list.containsAll : " + list.containsAll(list2));
		
		for ( int i =list2.size()-1; i >= 0 ; i--) {
			if( list.contains(list2.get(i)) )
				list2.remove(i);
		}
		print(list, list2);
		
	}

	private static void print(ArrayList list, ArrayList list2) {
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
		System.out.println();
		
	}

}
