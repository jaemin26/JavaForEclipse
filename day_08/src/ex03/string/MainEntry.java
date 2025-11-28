package ex03.string;

class Point{ } 


public class MainEntry {
	public static void main(String[] args) {
		int x = 99;
		String str = "abc";
		System.out.println(str);
		
		char data[] = {'a','b','c','d'};
		String str2 = new String(data);
		
		System.out.println(data);
		System.out.println(str2);
		
		
		String msg = "cdefghij";
		System.out.println("Korea " + msg);
		System.out.println(msg);
		
		msg = msg.concat("Kosa");
		System.out.println(msg);
		
		String str3 = "abcdef".substring(2);
		System.out.println(str3);
	}
}
