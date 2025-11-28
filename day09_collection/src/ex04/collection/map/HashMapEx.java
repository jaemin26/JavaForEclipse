package ex04.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("홍길동", 50);
		map.put("손연재", 70);
		map.put("집에", 80);
		map.put("가고싶다", 100);
		
		Set set = map.entrySet(); //System.out.println(set);
		Iterator it = set.iterator(); // System.out.println(it.next()); 누군진 모르지만 첫번째
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : " + e.getKey() + "  점수 : " + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단 : " + set);
		Collection values = map.values();
		it = values.iterator(); //점수만 모아놓은 리스트
//		System.out.println(values);
//		System.out.println(it.next());
		
		int total = 0;
		while (it.hasNext()) {
			Integer num = (Integer)it.next();
			total += num.intValue();
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		System.out.println("최고점 : " + Collections.max(values));
		System.out.println("최하점 : " + Collections.min(values));
	}

}
