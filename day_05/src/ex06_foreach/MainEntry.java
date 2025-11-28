package ex06_foreach;

public class MainEntry {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		
		System.out.println("오름차순 출력");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ "\t");
		}
		System.out.println();
		// for(자료형 변수명:컬렉션명 또는 배열명){반복구문;}
		
		for (int item : arr ) {
			System.out.print(item+"\t");
		}
		System.out.println();
		System.out.println("====================");

		System.out.println("내림차순 출력");
		
		for (int i = arr.length-1; i>=0; i-- ) {
			System.out.print(arr[i]+"\t");
		}
			
	}

}
