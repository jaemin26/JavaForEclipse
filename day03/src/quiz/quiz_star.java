package quiz;

public class quiz_star {
	public static void main(String[] args) {
		
		for(int j = 0; j < 5; j++) {
			System.out.println();
				
			for(int k = 5; k > j; k--) {					
				System.out.print("*");
			}
		}
	}

}

