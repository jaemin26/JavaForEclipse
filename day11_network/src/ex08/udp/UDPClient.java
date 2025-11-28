package ex08.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
	public static void main(String[] args) {
		DatagramSocket socket = null;
		
		try {
			// 서버 주소와 포트 설정
			InetAddress serverAddress = InetAddress.getByName("localhost");
			int serverPort = 9876;
			socket = new DatagramSocket();
			// 보낼 메세지
			String message = "안녕하세요. 클라이언트입니다.";
			DatagramPacket sendPacket = new DatagramPacket(message.getBytes(),message.length(),
					serverAddress, serverPort);
			// 서버로 메세지 전송
			socket.send(sendPacket);
			System.out.println("서버로 메세지 전송했습니다." + message);
			// 서버로부터 응답 받기
			byte[] receiveData = new byte[65536];
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			socket.receive(receivePacket);
			// 서버의 응답 메세지 출력
			String responseMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
			System.out.println("서버로부터 받은 응답 : " + responseMessage);
			
		} catch (Exception e) {
				e.printStackTrace();
		} finally {
			if (socket != null && !socket.isClosed())
				socket.close();
		}
	}

}
