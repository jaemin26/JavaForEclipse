package quiz;

public class quiz3 {
	// 3. 1~100까지 중에서 3의 배수의 개수, 합 구하는 프로그램
	public static void main(String[] args) {
		
		int sum = 0, cnt = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i%3==0) {
				sum += i;
				cnt++;
			}
		}
		
		System.out.printf("1~100까지 3의 배수의 개수 : %d\n",cnt);
		System.out.printf("1~100까지 3의 배수의 합 : %d",sum);
	}

}
