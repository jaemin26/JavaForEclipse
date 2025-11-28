package ex05.network.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest {	//socket 1개 필요
	public static void main(String[] args) {
		Socket s = null;
		
		try {
			s = new Socket("192.168.2.41", 9000); //server ip & port number
		//   I          /       O
			InputStream is = s.getInputStream(); //read
			OutputStream os = s.getOutputStream(); //write
			
//			String str = "클라이언트입니다.";
			System.out.println("send server 입력 : ");
			String str = new Scanner(System.in).nextLine();
			os.write(str.getBytes());
			byte[] buffer = new byte[100];
			is.read(buffer);
			System.out.println(new String(buffer));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//try end
	}
}
