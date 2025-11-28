/*
package ex05.Switch;


import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		System.out.println("point = ?(1,2,3,) ");
		int point = new Scanner(System.in).nextInt();
		
		switch((int)point) {
			case 1: 
				System.out.println("포인트 점수 1점 ");
				break;
				
			case 2: 
				System.out.println("포인트 점수 2점 ");
				break;
				
			case 3: 
				System.out.println("포인트 점수 3점 ");
				break;
				
			default: //생략가능 - 에러처리 메세지 넣으면 좋음
					System.out.println("없는 포인트");
					System.exit(0);
		}
		
		System.out.println("main end! ");
		
	}

}
*/

package ex05.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		System.out.println("도시를 선택하세요. (s, d, b) ");
		String ch = new Scanner(System.in).next();
		
		switch(ch) {
			case "s": 
				System.out.println("서울");
				break;
				
			case "d": 
				System.out.println("대전");
				break;
				
			case "b": 
				System.out.println("부산");
				break;
				
			default: //생략가능 - 에러처리 메세지 넣으면 좋음
					System.out.println("없는 도시");
					System.exit(0);
		}
		
		System.out.println("main end! ");
		
	}

}
