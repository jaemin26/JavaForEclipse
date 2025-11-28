package ex05.stringBuffer;

public class MainEntry {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.hashCode());
		
		System.out.println("length / capacity");
		System.out.println(sb.length() + "           /       "+ sb.capacity());
		int len = sb.length(); int size = sb.capacity();
		System.out.println(len + "          /        " + size);
		
		sb.append("java developer");
		len = sb.length(); size = sb.capacity();
		System.out.println(len + "          /        " + size);
		
		sb.append(" happy virus");
		System.out.println(sb.toString());
		len = sb.length(); size = sb.capacity();
		System.out.println(len + "          /        " + size);
		
		sb.append(" 12341231231241231");
		System.out.println(sb.toString());
		len = sb.length(); size = sb.capacity(); //크기는 원래 가지고 있던 버퍼크기의 2배+null
		System.out.println(len + "          /        " + size);
		
		sb.trimToSize(); // 크기 조절
		len = sb.length(); size = sb.capacity(); //크기는 원래 가지고 있던 버퍼크기의 2배+null
		System.out.println(len + "          /        " + size);
		
		System.out.println(sb.hashCode());
	}	

}
