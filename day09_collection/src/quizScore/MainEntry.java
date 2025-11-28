package quizScore;

import java.util.Scanner;

public class MainEntry {
	
	public static void main(String[] args) {
		
		int select = 0;
		StuManager stuM = new StuManager();
		Student.cnt = 1;
		Scanner sc = new Scanner(System.in);
		
		while(select != 5) {
			System.out.println("========== 학생 성적 ==========");
			System.out.println("1.추가   2. 삭제   3. 출력   4. 수정  0. 종료");
			System.out.print("번호 선택하세요. ( 0~4번 중에서만 선택) : ");
			select = sc.nextInt();
			
			switch( select ){
				case 1 :	stuM.add(); break;
				case 2 :					
					stuM.display();
					System.out.print("삭제할 번호 입력하세요(int) : ");
					stuM.del(sc.nextInt());
					break;
				case 3 :	stuM.display(); break;
				case 4 :	stuM.set(); break;
				case 0 : System.out.println("회원 가입을 종료합니다. ");
							System.exit(0); // 프로그램 강제 종료
				default :
					System.out.println("잘못 선택하셨습니다. 없는 번호 입니다.( 0~4번 중에서만 선택) "); break;
			}
		}
	}

}
