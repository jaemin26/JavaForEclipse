package ex03.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetAllByNameTest {
	public static void main(String[] args) throws UnknownHostException {

		InetAddress address = InetAddress.getLocalHost();
		System.out.println("로컬 호스트 이름 : " + address.getHostName());
		System.out.println("로컬 호스트 IP : " + address.getHostAddress());

		address = InetAddress.getByName("www.sw.or.kr");
		System.out.println("로컬 호스트 이름 : " + address.getHostName());
		System.out.println("로컬 호스트 IP : " + address.getHostAddress());

		byte[] addr = new byte[4]; // 192.168.2.41
		addr[0] = (byte) 192;
		addr[0] = (byte) 168;
		addr[0] = (byte) 2;
		addr[0] = (byte) 41;
		address = InetAddress.getByAddress(addr);
		System.out.println("로컬 호스트 이름 : " + address.getHostName());
		System.out.println("로컬 호스트 IP : " + address.getHostAddress());
		System.out.println("로컬 호스트 IP : " + address.getCanonicalHostName());

		InetAddress[] arr = InetAddress.getAllByName("www.naver.com");
		for (InetAddress item : arr) {
			System.out.println("로컬 호스트 이름 : " + item.getHostName());
			System.out.println("로컬 호스트 IP : " + item.getHostAddress());
		}
	}
}
