package ex08.udp;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramServer {
	public static void main(String[] args) {
		DatagramPacket  dp = null;
		DatagramSocket ds = null;
		DataOutputStream dos = null;
		
		int port = 5000;
		String str;
		File file = null;
		
		try {
			System.out.println("@@@ UDP File Server @@@");
			ds = new DatagramSocket(port);
			
			while(true) {
				dp = new DatagramPacket(new byte[65536], 65536);
				ds.receive(dp);  // 데이터 수신
				
				str = new String(dp.getData(), 0, dp.getLength()).trim(); 
				
				if( str.equalsIgnoreCase("start")) {
					System.out.println("전송 되고 있습니다.....");
					file = new File("sample.txt");
					
					dos = new DataOutputStream(
									new BufferedOutputStream(
												new FileOutputStream(file)));
				} else if( str.equalsIgnoreCase("end") ) {
					System.out.println("end");
					break;
				} else {
					//System.out.println(str);
					dos.write(dp.getData(), 0, dp.getLength());
				} // if end
			} // end while
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {	dos.close();		} catch (IOException e) {		e.printStackTrace();		}
		}
	}
}









