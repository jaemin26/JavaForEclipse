package quiz_pp;

import java.util.Scanner;

public class Quiz_ex04 {
	
	public static void main(String[] args) {
		//진도에 맞춰서 업데이트
		//예외처리, 배열, 클래스, 메소드
		
		
		Scanner sc = new Scanner(System.in);
		
		int[][] score = new int[3][3]; //1열국어 2열영어 3열전산
		String[] name = new String[3];
		char grade = ' ';
		int[] sum = new int[3];
		int stu = 3;
		
		//수정: 평균값 저장할 필드를 미리 선언하지않고 산술식 사용하면 인원이 수정될 때마다 수정해야함. 수정필요
		
		while(true){
		
			for(int i=0; i < score.length; i++) {
				System.out.printf("%d번째 학생 이름 입력 : ",i+1);
				name[i] = sc.next();
				
				do {
					System.out.print("국어 점수 : ");
					score[i][0] = sc.nextInt();
					
				} while(score[i][0] > 100);
				
				do {
					System.out.print("영어 점수 : ");
					score[i][1] = sc.nextInt();
				} while(score[i][1] > 100);
				
				do {
					System.out.print("전산 점수 : ");
					score[i][2] = sc.nextInt();
					
				} while(score[i][2] > 100);
				sum[i] = score[i][0]+score[i][1]+score[i][2];
			}
			
			
			for(int i=0; i <name.length; i++)
			{
				if(sum[i]/stu >=90)
					grade = 'A';
				else if(sum[i]/stu >=80)
					grade = 'B';
				else if(sum[i]/stu >=70)
					grade = 'C';
				else if(sum[i]/stu >=60)
					grade = 'D';
				else
					grade = 'F';
							
				System.out.printf("%s님의 성적표****************\n",name[i]);
				System.out.printf("국어 : %d , 영어 : %d , 전산 : %d\n",score[i][0],score[i][1],score[i][2]);
				System.out.printf("%s님 총점 : %d , 평균 %d  등급 %c \n",name[i], sum[i], sum[i]/stu,grade);
				
				if (sum[i]/3>=60) {
					
					if (score[i][0]>=40 && score[i][1] >=40 && score[i][2] >= 40) {
						System.out.println("합격입니다.");
						System.out.println();
					} else {
						if(score[i][0] < 40)
							System.out.printf("국어 %d", score[i][0]);
						if(score[i][1] < 40)
							System.out.printf("영어 %d", score[i][1]);
						if(score[i][2] < 40)
							System.out.printf("전산 %d",score[i][2]);
						System.out.println("점 과락으로 불합격입니다.");
						System.out.println();
						}
					}else {
						System.out.println("평균 60점 미만으로 불합격입니다.");
						System.out.println();
					}
			}
			
			
			System.out.println("추가 입력? Y/N");
			String ans = sc.next();
			
			if( ans.equalsIgnoreCase("n"))    
				break;
		}
	}

}
