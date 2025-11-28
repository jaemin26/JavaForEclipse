package quiz;

import java.util.Scanner;

public class ScoreMethod {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] point = new int[3]; //국어 영어 전산
		int[] total = new int[2]; //총점 평균
		
		while(true) {
			
			System.out.println("무엇을 ? (1:입력, 2:출력 3:평균 4:등급 0:종료");
			int a =sc.nextInt();
			String name = "이름";
			
			
			switch(a) {			
			case 1:
				name = input(point);
			case 2:
				output(point,name); break;
			case 3:
				total_avg(point,total,name); break;
			case 4:
				grade(total[1],name);
			case 0:
				System.exit(0);
			}
			
			
		}
		
		
	}
	
//		문제] 성적처리 프로그램을 함수로 분리한다.
//	 입력함수 input() - 이름, 국어,영어,전산 점수
//	 출력함수 output()
//	 총점_평균 구하는 함수 total_avg(~~~~ )
//	 학점 구하는 함수 grade(~~~)
//	 메인함수

	public static String input(int[] point) {
		
		String name;
		
		System.out.println("이름 ? : ");
		name = new Scanner(System.in).nextLine();
		System.out.println("국어 점수는? : ");
		point[0] = new Scanner(System.in).nextInt();
		System.out.println("영어 점수는? : ");
		point[1] = new Scanner(System.in).nextInt();
		System.out.println("전산 점수는? : ");
		point[2] = new Scanner(System.in).nextInt();
		
		return name;
	}
	
	public static void output(int[] point, String name) {
		
		
		System.out.printf("국어: %d  영어:%d 전산:%d ",point[0],point[1],point[2]);
		
	}
	
	public static void total_avg(int[] point, int[] total, String name) {
		
		for(int i=0; i<point.length; i++) {
			total[0] += point[i];
		}
		
		double avg = total[0]/3; 		
		
		System.out.printf("%s님 총점:%d 평균:%d", total[0],avg);
		
	}
	
	public static void grade(int x, String name) {
		
		char grade;
		
		if(x >=90)
			grade = 'A';
		else if(x >=80)
			grade = 'B';
		else if(x >=70)
			grade = 'C';
		else if(x >=60)
			grade = 'D';
		else
			grade = 'F';
		
		System.out.println(name +"님의 학점 : "+ grade);
	}
	

}
