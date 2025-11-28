package videoQuiz;

import java.util.Iterator;
import java.util.Scanner;

public class VideoMain {

	public static void main(String[] args) {
		
		int choice;
		
		Scanner sc = new Scanner(System.in);
		VideoManager vm = new VideoManager();
		
		
		while(true) {
			System.out.println("1.추가 / 2.삭제 / 3.출력 / 4.수정 / 5.대여 / 6. 반납 / 0.종료");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				vm.add(); break;
			case 2:
				vm.delete(); break;
			case 3:
				vm.print(); break;
			case 4:
				vm.update(); break;
			case 5:
				vm.lend(); break;
			case 6:
				vm.returnVideo(); break;
				
			case 0: System.exit(0);
			default :
				System.out.println("0~4번 까지 선택");
			}
		}

		
		
		
	}
}
