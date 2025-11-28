package ex07.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx2 {
	
	static HashMap<Object, Object> phoneBook = new HashMap<Object, Object>();
	
	public static void main(String[] args) {
		
		addPhoneNo("친구", "김연아", "010-1111-2222");
		addPhoneNo("친구", "김길동", "010-2222-2222");
		addPhoneNo("친구", "모올라", "010-3333-2222");
		addPhoneNo("회사", "아무개", "010-3333-2222");
		addPhoneNo("회사", "김무개", "010-3335-2222");
		addPhoneNo("회사", "이무개", "010-3331-2222");
		addPhoneNo("세탁", "010-3345-4444");
		
		printList();
		
		//HashMap tmp = new HashMap();
		//tmp.put("안녕","");
		//System.out.println(tmp); //key 값만 주어진 상태로 맵형성이 가능한 지 테스트
	}
	//그룹을 추가하는 메소드
	static void addGroup(String groupName) {
		
		if ( !(phoneBook.containsKey(groupName)) ) {
			phoneBook.put(groupName, new HashMap()); //맵안에 또다시 맵 가능. 이 상태에서 value 인 HashMap은 객체그릇만 담길 수 있음(안에 데이터없음)
		}
	}
	
	//그룹에 연락처를 추가하는 메소드
	public static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		
		HashMap<String, Object> group = (HashMap)phoneBook.get(groupName); // 
		group.put(tel,name); // 이름은 중복될 수 으니, 전화번호를 key값으로
	}
	
	public static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타", name, tel);
		
	}
	
	//전화번호 전체를 출력하는 메소드
	public static void printList() {
		Set<Entry <Object, Object>> set = phoneBook.entrySet(); //System.out.println(set);
		Iterator<Entry <Object, Object>> it = set.iterator();
		
		while( it.hasNext() ) {
			Map.Entry e = (Map.Entry)it.next(); //System.out.println(e);
			
			Set<?> subSet = ((HashMap<?, ?>)(e.getValue())).entrySet();
			Iterator<?> subIt = subSet.iterator();
			System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");
			
			while(subIt.hasNext()) {
				Map.Entry subE = (Map.Entry)subIt.next();
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.println(name + " " + telNo);
			}//in while
		}//out while
	}
	

}
