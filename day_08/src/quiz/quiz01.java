package quiz;

import java.util.Scanner;

public class quiz01 {
	
	public static void main(String[] args) {
		
		//문제] String str = "abcDEFGHeijwEIMPYmnqr";
		//위의 str 문자열을 대문자는 소문자로, 소문자는 대문자로 출력하는 프로그램 작성
		String str = "abcDEFGHeijwEIMPYmnqr";
		String tmp = "";

		for(int i = 0; i<str.length(); i++){
			char c = str.charAt(i);
			if(Character.isUpperCase(str.charAt(i)))
				tmp += Character.toLowerCase(str.charAt(i));
			else
				tmp += Character.toUpperCase(str.charAt(i));
			}
		System.out.println(tmp);
		
		System.out.println("===============================");
		// 임의의 문자열을 입력 받아서 대문자 -> 소문자, 소문자 -> 대문자로 출력
		
		
		System.out.println("입력하세요 : ");
		String s = new Scanner(System.in).nextLine();
					
		char c = s.charAt(0);
		if(Character.isUpperCase(c))
			c = Character.toLowerCase(c);
		else
			c = Character.toUpperCase(c);
					
		System.out.println(c);
			
		System.out.println("===============================");
		// str = "ABC def kbsmbc 123 BB"; 대문자의 갯수 소문자의 갯수, 숫자의 개수?(isDigit)
		
		str = "ABC def kbsmbc 123 BB";
		int upper = 0, lower = 0, digit = 0;
		for(int i =0; i<str.length(); i++) {
			char c2 = str.charAt(i);
			if(Character.isUpperCase(c2))
				upper++;
			else if(Character.isLowerCase(c2))
				lower++;
			else if(Character.isDigit(c2))
				digit++;
		}
		System.out.println(str + " 의 대문자,소문자,숫자 갯수");
		System.out.println("대문자 : " + upper + " 소문자 : " + lower + " 숫자 : " + digit);
		
		
	}

}
