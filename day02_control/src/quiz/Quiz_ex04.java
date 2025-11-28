package quiz;

import java.util.Scanner;

public class Quiz_ex04 {
	
	public static void main(String[] args) {
		//진도에 맞춰서 업데이트
		//예외처리, 배열, 클래스, 메소드
		
		int kor, eng, com, sum, tmp = 1;
		
		String name;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		
		do {
			
			name = sc.nextLine();
			System.out.print("국어 점수 : ");
			kor = sc.nextInt();
			System.out.print("영어 점수 : ");
			eng = sc.nextInt();
			System.out.print("전산 점수 : ");
			com = sc.nextInt();
			
			if(kor > 100 || eng > 100 || com > 100) {
				System.out.println("100점 초과. 다시 입력!");
				kor = 0; eng = 0; com = 0;
				tmp = 1;
			}else
				tmp = 0;
			
		}while(tmp!=0);
		
			
			

		sum = kor + eng + com;
		
		System.out.println("이재민님의 성적표*********");
		System.out.printf("국어 : %d , 영어 : %d , 전산 : %d\n",kor,eng,com);
		System.out.printf("총점 : %d , 평균 %d \n", sum, sum/3);
		
		if( (((sum/3)>=60) && (kor>40) && (eng>40) && (com>40)))
			System.out.println("합격");
		else if(kor<=40)
			System.out.println("국어 과락 불합격");
		else if(eng<=40)
			System.out.println("영어 과락 불합격");
		else if(com<=40)
			System.out.println("전산 과락 불합격");
		else
			System.out.println("불합격");
						
	}

}
