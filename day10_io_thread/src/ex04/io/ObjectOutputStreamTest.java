package ex04.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamTest {
	public static void main(String[] args) throws Exception {
		
		Grade vo = new Grade();
//		vo.setScore(99);
//		vo.setSubject("전산");
			
	//	System.out.println(vo);
		
		vo.setSubject("음악");
		vo.setScore(100);
		
		OutputStream os = new FileOutputStream("grade.dat");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		oos.writeObject(vo);
		oos.close();
	}

}
