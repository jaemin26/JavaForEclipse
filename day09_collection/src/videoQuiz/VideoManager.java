package videoQuiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class VideoManager{
	
	String no, title, category, lendName , lendDate, lendStatus;
	boolean lend;
	
	HashMap<String, VideoInfo> video = new HashMap<String, VideoInfo>();
	Scanner sc = new Scanner(System.in);
	
	public void add() {
		System.out.print("비디오 번호 ? : ");
		no = sc.nextLine();
		System.out.print("비디오 제목 ? : ");
		title = sc.nextLine();
		System.out.print("비디오 장르 ? : ");
		category = sc.nextLine();
		
		VideoInfo vInfo = new VideoInfo(no, title, category);
	
		video.put(no, vInfo);
	}
	
	public void delete() {
		System.out.print("삭제할 비디오 번호는? : ");
		no = sc.next();
		if (video.containsKey(no)) video.remove(no);
			else System.out.println("해당 비디오 없음");
	}
	
	public void print() {
		if(video.isEmpty()) {
			System.out.println("등록된 비디오 없음");
		} else {
			for ( VideoInfo v : video.values()) {
				if(v.lend==false) { 
					lendStatus = "대여자 없음";
					System.out.println("번호 : " + v.no + " 제목 : " + v.title + " 장르 : " + v.category + " 대여자 없음");
				} else {
					System.out.println("번호 : " + v.no + " 제목 : " + v.title + " 장르 : " + v.category + "\t대여자 : " + v.lendName + " 대여날짜 : " + v.lendDate );

				}
			}
		}
	}
	
	public void update() {
		int choice;
		System.out.print("수정할 비디오 번호 : ");
		no = sc.next();
		if (video.containsKey(no)) {
			VideoInfo v = video.get(no);
			System.out.println("수정 항목 1.제목 2.장르 : ");
			choice = sc.nextInt();
			sc.nextLine(); // 입력 에러 방지
			switch(choice) {
				case 1:
					System.out.print("수정할 제목 입력 : ");
					title = sc.nextLine();
					v.setTitle(title);
					break;
				case 2:
					System.out.print("수정할 장르 입력 : ");
					category = sc.nextLine();
					v.setCategory(category);
					break;
				default:
					System.out.println("잘못 선택! 수정 중단.");
			}
			
		} else {
			System.out.println("해당 비디오가 등록되어 있지 않음");
		}
	}
	
	public void lend() {
		System.out.print("대여할 비디오 번호 입력 : ");
		no = sc.nextLine();
		if(video.containsKey(no)) {
			VideoInfo v = video.get(no);
			if(v.lend == false) {
				System.out.print("대여자 이름 입력 : ");
				v.lendName = sc.nextLine();
				v.setLendDate();
				v.setLend(true);
				System.out.println("대여 완료!!!");
			} else if(v.isLend()){
				System.out.println("이미 대여중인 비디오입니다.");
			} else System.out.println("등록된 비디오 없음.");
		}
	}
	
	public void returnVideo() {
		System.out.print("반납할 비디오 번호 입력 : ");
		no = sc.nextLine();
		if(video.containsKey(no)) {
			VideoInfo v = video.get(no);
			if(v.isLend()) {
				System.out.println("반납 완료!!!");
				v.lend = false;
			}	
		} else System.out.println("일치하는 비디오 없음!");
	}
	
	
}
