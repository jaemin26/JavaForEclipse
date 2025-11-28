package ex05.network.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTest { // Socket 2개 필요
	public static void main(String[] args) {
		
		ServerSocket ss = null;
		Socket s = null;
		System.out.println("Server Start");
		try {
			ss = new ServerSocket(9000); // 0~1024 port number 예약되어 있음
			s = ss.accept(); //client socket 응답대기
			//   I          /       O
			InputStream is = s.getInputStream(); //read
			OutputStream os = s.getOutputStream(); //write
			
			byte[] arr = new byte[100];
			is.read(arr);
			System.out.println(new String(arr));
			System.out.println("send client : "); //클라이언트 들어올 때까지 대기
			String message = new Scanner(System.in).nextLine();
			os.write(message.getBytes());
			
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
