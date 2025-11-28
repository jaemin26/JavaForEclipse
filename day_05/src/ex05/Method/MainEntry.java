package ex05.Method;



public class MainEntry {
	
	public static void main(String[] args) {
		
		int x = 3, y = 5;
		
		int result = MethodEx(x,y);
		System.out.println(result); line();
		
		int[] arrResult = methodEx2();
		
		for(int i=0; i<arrResult.length; i++) {
			System.out.print(arrResult[i] + " " );
		}
		System.out.println();
		
		for (int item : arrResult)
			System.out.print(item + " ");
		System.out.println();
		
		int[][] resultArr = methodEx3();
		int sum = 0;
		for(int i = 0; i<resultArr.length; i++) {
			for(int j = 0; j<resultArr[i].length; j++) {
				sum += resultArr[i][j];
			}
		}
		line();
		
		for (int[] item : resultArr) {
			//System.out.println(item);
			System.out.println(item.hashCode());
			//메모리상의 주소(16진수형태)를 10진수 형태로
		}
		
		int hap = 0;
		for (int[] item : resultArr) {
			
			for(int arrItem : item) {
				System.out.print(arrItem + " ");
				hap += arrItem;
			}
			System.out.println();
		}
		
			
		
		
	}
	
	private static int[][] methodEx3() {
		// TODO Auto-generated method stub
		int[][] arr = { {1,2,3,4}, {5,6,7,8} };
		return arr;
	}

	private static int[] methodEx2() {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		
		return arr;
	}

	private static int MethodEx(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	public static void line() {
		
		System.out.println("------------------------");
		
	}
	

}
