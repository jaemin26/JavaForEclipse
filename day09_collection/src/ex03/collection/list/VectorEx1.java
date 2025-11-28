package ex03.collection.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx1 {
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();
		System.out.println("length  : " + v.size() + " / capacity : " + v.capacity());
		
		Vector<Integer> v2 = new Vector<>(3, 4); //초기용량 증가용량
		v2.add(10);		v2.add(20);		v2.add(30);		v2.add(20);
		v2.add(40);		v2.add(50);		v2.add(100);		v2.add(1000);
		System.out.println("length  : " + v2.size() + " / capacity : " + v2.capacity());
		
		System.out.println(v2); //순서 있고 중복 허용
		System.out.println(v2.size() + "개 요소 있음");
		
		Iterator it = v2.iterator();
		
		System.out.println("iterator 사용 -------------");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("get() 사용 ----------------");
		for ( int i = 0; i < v2.size(); i++ ) {
			System.out.println(v2.get(i));
		}
		
		System.out.println("sort() 사용 ----------------");
		Collections.sort(v2);
		for ( int i = 0; i < v2.size(); i++ ) {
			System.out.println(v2.get(i));
		}
		
		System.out.println("elementAt() 사용 ----------------");
		for ( int i = 0; i < v2.size(); i++ ) { //vector 에 있는 모든 요소에 대해 반복
			System.out.println(v2.elementAt(i));
		}
		
		System.out.println("trimToSize() 사용 ----------------");
		v2.trimToSize();
		System.out.println("length  : " + v2.size() + " / capacity : " + v2.capacity());
	}

}
