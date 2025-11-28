/*
package ex06.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerMain {
	public static void main(String[] args) {
		StringTokenizer token = 
				new StringTokenizer("김연아/박태환/손연재/이재민/두효정/조재표","/");
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		
		//split() 메소드 이용해서 출력
		System.out.println("============split() 메소드 이용");
		String str = "김연아/박태환/손연재/    이재민/두효정/조재표";
		String[] result = str.split("/");
		
		for (String s : result)
		{
			System.out.print(s.trim());
		}
		System.out.println();
		str = "김연아/박태환|손연재/    이재민/두효정&조재표";
		//split() 메소드로 "|"와 "&" 기준으로 문자열 나누기
		System.out.println("============split() 메소드 이용");
		String[] result2 = str.split("[|&]");
		for (String s : result2)
		{
			System.out.println(s.trim());
		}
	}

}

//*/
package ex06.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerMain {
	public static void main(String[] args) {
		StringTokenizer token = 
				new StringTokenizer("사과=10|초코렛=3|샴페인=1", "|",true);
		String str = token.nextToken();
		
		while(token.hasMoreTokens()) {
			if ( str.equals("=") )
				System.out.println("\t");
			else if( str.equals("|") )
				System.out.println("\n");
			else
				System.out.println(str);
		}
		
		
	}

}