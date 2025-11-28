package ex05.flie;

import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws Exception{
		
		RandomAccessFile raf = new RandomAccessFile("sawon.txt", "rw");
		//sawon.txt 파일이 없다면 생성하면서 기재하고, 있으면 기존 파일에 기재한다.
		
		for ( int i=0; i<100; i++ ) {
			raf.seek(i*100); // 위치
	//		raf.seek(10); // 위치 한곳만 지정하면 하나만 써짐
			String str = "hello" + i;
	//		raf.writeInt(1000);
			raf.writeUTF(str);
		}
		
		for ( int i=0; i<100; i++) {
			raf.seek(i*100);
			System.out.println(raf.readUTF());
		}
		
		System.out.println("string input success");
		raf.close();
	}
}
