package ex03.file;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DataOutputStreamEx {
	
	public static void main(String[] args)throws Exception {
		
		File file = new File("test.txt");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeChar(65);
		dos.writeShort(100);
		dos.writeInt(5000);
		dos.writeLong(888888);
		dos.writeFloat(555555);
		dos.writeDouble(123141231.231231);
		
		dos.flush(); // buffer 비우기
		System.out.println("test.txt 파일에" + dos.size() + "byte save");
	}

}
