package quizCustomer;

import java.util.Scanner;

public class MainEntry {  // View
	
	public static void main(String[] args) {
		//Customer c = new Customer();
		
		int select=0;
		CustomerManager	cm = new CustomerManager();
		Customer.cnt = 1; // 첫 생성자 호출시 입력되는 값 날라가는거 방지
		Scanner sc = new Scanner(System.in);
		
		while(select != 5 ){
			//member.display();
			System.out.println("====== 회원 가입 정보 ======");
			System.out.println("1.추가   2. 삭제   3. 출력   4. 수정  0. 종료");
//			System.out.print("번호 선택하세요. ( 1: add ,2: delete, 3: print, 4: change, 0: exit ) : ");
			System.out.print("번호 선택하세요. ( 0~4번 중에서만 선택) : ");
			select = sc.nextInt();
			
			switch( select ){
				case 1 :	cm.add(); break;
				case 2 :					
					cm.display();
					System.out.print("삭제할 번호 입력하세요(int) : ");
					cm.del(sc.nextInt());
					break;
				case 3 :	cm.display(); break;
				case 4 :	cm.set(); break;
				case 0 : System.out.println("회원 가입을 종료합니다. ");
							System.exit(0); // 프로그램 강제 종료
				default :
					System.out.println("잘못 선택하셨습니다. 없는 번호 입니다.( 0~4번 중에서만 선택) "); break;
			} // switch end
		} // while end
		System.out.println("수고하셨습니다.");
		

	}

}
