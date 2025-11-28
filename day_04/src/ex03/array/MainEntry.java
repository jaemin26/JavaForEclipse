package ex03.array;

public class MainEntry {
	public static void main(String[] args) {
	
		//1. 
		char[] ch; // 배열선언
		ch = new char[4]; // 배열생성, 메모리에 할당
		
		//2.
		char[] ch2 = new char[4]; //배열선언 및 생성
		
		//배열 초기화
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		//3.
		char[] ch3 = {'J', 'A','V','A','k','b','s'};//초기화
		char[] ch4 = new char[] {'J', 'A','V','A','k','b','s'};
		
		//배열의 길이(크기)
		System.out.println("배열의 길이(크기) : " + ch2.length);
		
		//배열의 내용 출력
		//System.out.println("ch[2] = " + ch[2]);
		
		for (int i = 0; i < ch.length; i++)
			System.out.print("ch[" + i + "] = " + ch[i] + " ");
	}
}
