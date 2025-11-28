package ex04.network;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlTest {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EC%82%BC%EC%84%B1&ackey=6zrxx6bf");
		
		//URL이 갖고 있는 함수들 사용
		System.out.println("프로토콜 : " + url.getProtocol());
		System.out.println("호스트와 포트 : " + url.getAuthority());
		System.out.println("호스트  : " + url.getHost());
		System.out.println("포트 : " + url.getPort());
		System.out.println("경로 : " + url.getPath());
		System.out.println("질의 : " + url.getQuery());
		System.out.println("파일명 : " + url.getFile());
		System.out.println("참조 : " + url.getRef());
		
		
	}

}
