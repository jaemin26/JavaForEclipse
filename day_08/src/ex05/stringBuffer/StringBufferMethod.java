package ex05.stringBuffer;

public class StringBufferMethod {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" is pencil"); //문자열 추가
		System.out.println(sb);
		
		sb.insert(7, " my"); //문자열 삽입
		System.out.println(sb);
		
		sb.replace(8, 10, "your's");
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		System.out.println();
		System.out.println(sb.indexOf("your"));;
		
		System.out.println(sb.indexOf("s"));
		System.out.println(sb.lastIndexOf("s"));
		
		sb.delete(0, 5);
		System.out.println(sb);
		
		sb.setLength(5);
		System.out.println(sb);
		
		sb.trimToSize();
		System.out.println(sb.capacity());
	}

}
