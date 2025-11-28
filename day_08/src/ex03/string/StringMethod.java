package ex03.string;

public class StringMethod {
	public static void main(String[] args) {
		
		String s1 = "happy";
		String s2 = "SEOUL";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.replace("EO", "KOREA"));
		System.out.println(s2);
		
		//s1 = s1 + s2;
		s1 = s1.concat(s2);
		System.out.println(s1);
		
		String s3 = new String("   ab    cd");
		s3 = s3.trim();//공백제거
		System.out.println(s3.length());
		
//		String s4 = new String("ab defg 23455 keirte 935234");
//		String[] s5 = s4.split(" ");
		String s4 = new String("ab/defg/23455/keirte/935234");
		String[] s5 = s4.split("/");
		
		for (String s : s5)
			System.out.println(s);
		
//		for ( int i = 0; i<s5.length; i++)
//			System.out.println(s5[i]);
		
		String s8 = "123141231 4123afasdf";
		char ch = s8.charAt(3);
		System.out.println(ch);
		s8 = s8.substring(1, 5);
		System.out.println(s8);
		System.out.println("--------------------");
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		char[] ch2 = s1.toCharArray();
		for(char c : ch2)
			System.out.print(c);
		System.out.println("===================");
		System.out.println(String.valueOf(ch));
	}

}
