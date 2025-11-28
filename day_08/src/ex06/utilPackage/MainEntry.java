package ex06.utilPackage;

import java.util.Calendar;
import java.util.Date;

public class MainEntry {
	
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance(); //system이 가지고 있는 날짜
		System.out.println(c.getTime());
		System.out.print(c.get(Calendar.YEAR));
		System.out.print(c.get(Calendar.MONDAY)+1);
		System.out.println(c.get(Calendar.DATE));
		
		Date date = new Date();
		int h = date.getHours(), m = date.getMinutes(), s = date.getSeconds();
		System.out.println("현재 시간은 : " + h +":"+m+":"+s);
	}

}
