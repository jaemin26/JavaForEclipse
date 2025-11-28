package ex04.collection.map;

import java.util.HashMap;
import java.util.Scanner;

public class MainEntry {
	
	public static void main(String[] args) {
		
		HashMap map = new HashMap<>(); //중복값 허용 X 순서 X
		
		map.put("kosa", "1234");
		map.put("sbs", "0000");
		map.put("kbs", "88888");
		
//		System.out.println(map);
//		
//		System.out.println("요소 개수 : " + map.size());
//		map.put("id", "pw");
//		System.out.println(map.get("kosa"));
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id / pwd 입력하세요.");
			System.out.println("id : ");			String id = sc.nextLine().trim();
			System.out.println("pwd : ");			String pwd = sc.nextLine().trim();
			System.out.println();
			
			if( !map.containsKey(id) ) {
				System.out.println("존재하지 않는 아이디입니다.");
				continue;
			} else {
				if ( !(map.get(id)).equals(pwd)) {
					System.out.println("비밀번호가 일치하지 않습니다.");
				} else {
				System.out.println("id와 pwd가 일치합니다");
				break;
				}
			}
			
			
			
		}
	}

}
