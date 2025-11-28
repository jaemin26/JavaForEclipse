package ex03.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//읽기 객체 - FileInputStream
		InputStream is = new FileInputStream("C:\\Users\\kosa\\Pictures\\coffee.jpg");

		//쓰기 객체 - FileOutputStream
		OutputStream os = new FileOutputStream("java.jpg");
		byte[] buffer = new byte[1024 * 8]; // byte 배열에 크기 할당해서 파일 옮기면 속도 빠름 read()함수에 지정한 공간할당
		
		long start = System.currentTimeMillis();
		
		while(true) {
			int inputData = is.read(buffer); //IOException
			if ( inputData == -1) break; //파일 받아올 때까지 루프
			os.write(inputData);
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - start); // 복사에 걸린 시간
		
		is.close();	os.close();
		
		System.out.println("copy success!");
		
	}
}
