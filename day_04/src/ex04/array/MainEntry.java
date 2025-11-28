package ex04.array;

public class MainEntry {
	public static void main(String[] args) {
		//1.
		int[][] a  = new int[2][3];
		
		//2.
		int[][] a2 = new int[][] { {1,2,3}, {4,5,6,} }; //초기화
		
		//3
		int[][] a3 = { {1,2,3}, {4,5,6,} };
		
		//System.out.println("a3[0][02] = " + a3[0][2]);
		
		for (int i=0; i<2; i++) {
			
			for (int j=0; j<3; j++ ) {
				System.out.println("a3[" +i+ "][" +j+ "] = " + a3[i][j]);
			}
		}
		
	}

}
