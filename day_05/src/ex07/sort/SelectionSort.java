package ex07.sort;

public class SelectionSort {
	public static void main(String[] args) {
		
		int[] arr = {7, 3, 5, 2, 8};
		int tmp;
		
		
		for (int i=0; i<arr.length-1; i++) {
			int min = i;
			for (int j=i+1; j < arr.length; j++) {
				if(arr[min] > arr[j]) {
					min = j;		
				}
			}
			tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
		}
		
		for( int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		
	}

}