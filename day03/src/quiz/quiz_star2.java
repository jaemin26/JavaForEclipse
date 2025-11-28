package quiz;

public class quiz_star2 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j < 5; j++) {
				System.out.print("*");
				for(int k = 4; k > 0; k--) {					
					System.out.print(" ");
				}
			}
		}
	}

}

