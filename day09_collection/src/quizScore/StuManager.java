package quizScore;

import java.util.ArrayList;
import java.util.Scanner;

public class StuManager extends Student {
	
	ArrayList<Student> list = new ArrayList<Student>();
	Scanner sc = new Scanner(System.in);
	
	public void add() {
		list.add(new Student());
	}
	public void del(int i) {
		list.remove(i-1);
	}
	public void display() {
		System.out.println("\n 성적표 인원 " + list.size() + "명");
		System.out.println("성적표 출력합니다.");
		System.out.println("------------------------------------");
		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			System.out.println("  " + (i+1) + "  " + stu.name + "의 성적표  국어 : " + stu.kor + " 영어 : "
					+ stu.eng + " 전산 : " + stu.com + " 평균 : " + stu.avg + " 등급 : " + stu.grade + result(stu.kor, stu.eng, stu.com));
		}
		System.out.println("------------------------------------\n");
	}
	
	public void set() {
		try {
			display();
			System.out.print("수정할 데이터의 번호를 입력하세요(int) : ");
			int n = sc.nextInt();
			Student stu = list.get(n-1);
			System.out.println("이름 : ");
			stu.name = sc.next();
			System.out.println("국어 점수 : ");
			stu.kor = sc.nextInt();
			System.out.println("영어 점수 : ");
			stu.eng = sc.nextInt();
			System.out.println("전산 점수 : ");
			stu.com = sc.nextInt();
			stu.avg = setAvgUp(stu.kor, stu.eng, stu.com);
			stu.grade = setGradeUp(stu.avg);
			
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String result(int kor, int eng, int com) {
		int avg = (kor+eng+com)/3;
		String msg = "";
		if(kor>=40 && eng>=40 && com>=40 && avg>=60)
			msg = "  합격!!!";
		else if(avg>=60 && kor<40)
			msg = "  국어 과락 불합격!!";
		else if(avg>=60 && eng<40)
			msg = "  영어 과락 불합격!!";
		else if(avg>=60 && com<40)
			msg = "  전산 과락 불합격!!";
		else
			msg = "  불합격!!";
			
		
		return msg;
	}
}
