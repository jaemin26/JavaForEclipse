package ex03.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class MainEntry {
	public static void main(String[] args) {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strUrl = null;
		InetAddress[] address;
		
		System.out.println("site address : ");
		try {
			strUrl = br.readLine(); 
			address = InetAddress.getAllByName(strUrl);
			for ( int i = 0; i < address.length; i++){
				System.out.println(address[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}


/*
package ex03.network;

import java.net.InetAddress;

public class MainEntry {
	public static void main(String[] args) {
	
		String host = "127.0.0.1";// 192.168.2.41 or localhost
		
		try {
			InetAddress[] address = InetAddress.getAllByName(host);
			for ( InetAddress item : address ) {
				System.out.println(item.getCanonicalHostName());
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
*/