package videoQuiz;

import java.util.HashMap;
import java.util.Scanner;

public class Video {
	
	static HashMap VideoList = new HashMap();
	
	public static void main(String[] args) {
		//헤드는 장르 -> 비디오번호 -> 비디오제목
		// (대여여부,(대여고객명)(대여일자))
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("1.추가 / 2.삭제 / 3.리스트 / 4.수정 / 0.종료");
			switch(sc.nextInt()) {
				case 1:
					addVideo();
				case 2:
				case 3:
				case 4:
				case 0: System.exit(0);
				default :
					System.out.println("0~4번 까지 선택");
						
			}
		}
	}
	
	public static void addTitle(HashMap map, String title) {
		
	}

	public static void addVideo(String genre) {
		if ( !(VideoList.containsKey(genre)) ){
			VideoList.put(genre, new HashMap());
		}	
	}
	public static void addVideo() {
		String videoNum, genre, title;
		System.out.println("비디오 추가중..");
		System.out.println("장르는 ? ex)멜로, 공포, 액션, 드라마");
		genre = new Scanner(System.in).next();
		System.out.println("비디오 number ? ");
		videoNum = new Scanner(System.in).next();
		
		addVideo(genre);
		HashMap video1 = (HashMap)VideoList.get(genre);
		video1.put(videoNum, new HashMap());
		
		System.out.println("비디오 제목 ? ");
		title = new Scanner(System.in).next();
		//addTitle()
		
		System.out.println(video1);
		System.out.println(VideoList);
	}

}
