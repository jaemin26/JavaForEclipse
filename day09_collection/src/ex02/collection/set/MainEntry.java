package ex02.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class MainEntry {
	
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>(); //중복 허용하지 않음
		hs.add("키보드");
		hs.add("마우스");
		hs.add("볼펜");
		hs.add("컵");
		
		System.out.println("요소 개수 : " + hs.size());
		System.out.println(hs); // 순서 없음
		
		
		HashSet<Integer> hs2 = new HashSet<>(); //타입 파라미터 안에는 primitive X wrapper O
		hs2.add(100);
		hs2.add(12345);
		hs2.add(5555);
		
		System.out.println(hs2);
		
		HashSet hs3 = new HashSet();
		hs3.add(10);
		hs3.add(3.14);
		hs3.add("hi");
		System.out.println(hs3);
		
		System.out.println("--------------------");
		
		Iterator it = hs3.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
}
