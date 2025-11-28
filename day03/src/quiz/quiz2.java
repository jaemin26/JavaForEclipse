package quiz;

public class quiz2 {
	// 2. 구구단 전체 출력 열우선 출력
	
	public static void main(String[] args) {
		
		
		int i, j;
		
		for(i = 1; i <= 9; i++) {
			for(j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t",j,i,i*j);
				
			}
			System.out.println();
		}
	}

}

