package ex02.returnValue;

public class MainEntry {
	
	public static void main(String[] args) {
		
		if(args.length < 1) {
			System.out.println("입력된 데이터 x ");
			return;
		}
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
//		System.out.println(args[3]);
//		System.out.println(args[4]);
//		System.out.println(args[5]);
		
		
		String str1 = args[0];
		String str2 = args[1];
		
		System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
	}

}
