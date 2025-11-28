package ex02.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
public class BufferdReaderMain {
	
	public static void main(String[] args) throws IOException {
		
		
//		InputStream is = System.in;
//		Reader reader = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(reader); 3줄 밑에처럼 요약
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("input = ");
		//String str = br.readLine(); // 예외발생
		//String str2 = br.readLine(); 
		//System.out.println(str+str2);
		
		//문자열로 받은 수를 연산하기 위해 파싱 필요
		int num = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int num3 = Integer.parseInt(br.readLine());
		System.out.println(num+num2);
	}

}
