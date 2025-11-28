
package ex02.io;

import java.io.IOException;
import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args) throws IOException{ //JVM으로 예외처리 위임
		
		InputStream is = System.in; // 표준입력
		
		System.out.print("단일 문자 입력 : ");
		
		int su = is.read()-48; // read() 예외발생 의무적으로 예외처리
			//System.out.println((char)su); //기본형 int ASCII 값을 받기 때문에 문자출력 원하면 형변환
		is.read();is.read(); // whiteSpace도 ASCII값을 가지고 있고, java에서 char형은 2Byte를 갖기 때문에 임의처리
			
		int su2 = is.read()-48; //수 그대로 받고 싶어서 ASCII값 -
		System.out.println(su + su2);
			
	
		
	}

}


/*/
package ex02.io;

import java.io.IOException;
import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args) {
		
		InputStream is = System.in; // 표준입력
		
		System.out.print("단일 문자 입력 : ");
		try {
			int su = is.read()-48; // read() 예외발생 의무적으로 예외처리
			//System.out.println((char)su); //기본형 int ASCII 값을 받기 때문에 문자출력 원하면 형변환
			is.read();is.read(); // whiteSpace도 ASCII값을 가지고 있고, java에서 char형은 2Byte를 갖기 때문에 임의처리
			
			int su2 = is.read()-48;
			System.out.println(su + su2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
*/