package ex07_whileDowhile;

public class MainEntry {
	public static void main(String[] args) {
		
		int a = 1, b = 2;
		
		while(a <=9 ) {
			b = 2;
			
			while(b <= 9) {
				
				System.out.printf("%d * %d = %d\t",a, b, b*a);
				b++;
			}
			a++;
			System.out.println();
			
		}
			
	}
}
