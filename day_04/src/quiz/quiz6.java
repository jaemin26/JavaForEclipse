package quiz;

public class quiz6 {
	public static void main(String[] args) {
		
		int[][] arr = new int[][] { { 3, 10, 2, 8 }, { 7, 15, 5, 3 }, { 0, 0, 0, 0 } };
		
		int sum = 0;
		
		
		
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[2][j] += arr[i][j];
			}
		}
		
		for(int i = 0; i < arr[2].length; i++) {
			System.out.print( arr[2][i] + "\t");
		}
		
	}

}


//01 + 11 02 +12