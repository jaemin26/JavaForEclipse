package quiz;

public class Quiz_ex01 {
	public static void main(String[] args) {
		
		int pay = 567890, tmp;
		
		tmp = pay / 10000;
		System.out.printf("만원 : %d\n", tmp);
		tmp = pay / 1000;
		tmp = tmp%10;
		System.out.printf("천원 : %d\n", tmp);
		tmp = pay / 100;
		tmp = tmp%10;
		System.out.printf("백원 : %d\n", tmp);
		tmp = pay / 10;
		tmp = tmp%10;
		System.out.printf("십원 : %d\n", tmp);
		
		
		
		
		//System.out.printf("%d", tmp);
		
	}

}


/*
result >
	만원 : 56장
	천원 : 7장
	백원 : 8개
	십원 : 9개
*/