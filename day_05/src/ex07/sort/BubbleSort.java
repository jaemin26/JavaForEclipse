package ex07.sort;

public class BubbleSort {
	public static void main(String[] args) {
		
		int[] arr = {7, 3, 5, 2, 8};
		int tmp;
		
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+"\t");
		
		System.out.println();
		
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				
				if(arr[j]> arr[j+1]) {
					tmp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+"\t");

		
	}

}
