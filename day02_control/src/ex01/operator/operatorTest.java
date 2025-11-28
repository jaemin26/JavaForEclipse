package ex01.operator;

public class operatorTest {
	public static void main(String[] args) {
//		int x = 3, y = 5, z= 7, result;
//		
//		result = (x > y) ? x : y;
		
		int a, b, c, d;
		a = b = c = d = 10;
		int su = -3;
		String str;
		
		str =((su % 2 != 0) && (su < 0)) ? "홀수 & 음수" :
				((su % 2 != 0) && (su > 0)) ? "홀수 & 양수" : "짝수 & 양수";
		
		System.out.println(su + " ===> "+ str);
		
		//System.out.println(result);
	}

}
