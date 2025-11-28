package quizScore;

import java.util.Scanner;

public class Student {

	protected String name;
	protected int kor, eng, com;
	protected double avg;
	protected char grade;
	static int cnt = 0;
	
	public Student(){
		if(cnt > 0) {
			System.out.println("student constructor");
			input();
		}
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		this.name = sc.nextLine();
		System.out.println("국어 점수 : ");
		this.kor = sc.nextInt();
		System.out.println("영어 점수 : ");
		this.eng = sc.nextInt();
		System.out.println("전산 점수 : ");
		this.com = sc.nextInt();
		System.out.println();
		setAvg();
		setGrade();
		
	}
	public void setAvg() {
		int sum = kor + eng + com;
		avg = sum/3;
	}
	public void setGrade() {
		
		switch((int)avg/10) {
		case 9: grade ='A'; break;
		case 8: grade ='B'; break;
		case 7: grade ='C'; break;
		case 6: grade ='D'; break;
		default: grade ='F';
		}
		
	}
	public double setAvgUp(int kor, int eng, int com) {
		int sum = kor + eng + com;
		avg = sum/3;
		return avg;
	}
	public char setGradeUp(double avg) {
		
		switch((int)avg/10) {
		case 9: grade ='A'; break;
		case 8: grade ='B'; break;
		case 7: grade ='C'; break;
		case 6: grade ='D'; break;
		default: grade ='F';
		}
		return grade;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getCom() {
		return com;
	}
	public void setKor(int point) {
		this.kor = point;
	}
	public void setEng(int point) {
		this.eng = point;
		
	}
	public void setCom(int point) {
		this.com = point;
	
	}
	public double getAvg() {
		return avg;
	}
	public char getGrade() {
		return grade;
	}
}
