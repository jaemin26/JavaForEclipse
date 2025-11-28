package quiz;

import java.util.Iterator;
import java.util.TreeSet;

/* TreeSet 이용해서 로또 프로그램 만들기

	실제 로또는 보너스번호가 존재하지만,
	이 코드에서는 6개 적중 시 1등, 5개 적중시 2등, 4개 적중시 3등.... 으로 구성

*/

public class quiz1 { 
	public static String check(TreeSet<Integer> great, TreeSet<Integer> num) {
		// 결과값 문자열로 돌려주는 함수
		Iterator it = great.iterator();
		int cnt = 0; //맞춘 갯수
		String result = ""; //결과
		while(it.hasNext()) {
			if ( num.contains(it.next())) cnt++;	
		}
		switch(cnt) {
			case 6:
				result = "1등 ";
				break;
			case 5:
				result = "2등 ";
				break;
			case 4:
				result = "3등 ";
				break;
			case 3:
				result = "4등 ";
				break;
			default:
				result = "꽝... ";
		}
		return result +cnt+"개 적중";
	}
	
	
	public static void main(String[] args) {
		
		TreeSet<Integer> great = new TreeSet<>(); // 당첨 번호
		TreeSet<Integer> num1 = new TreeSet<>(); // 내 번호 자동
		TreeSet<Integer> num2 = new TreeSet<>(); // 내 번호 수동
		int[] lotto = new int[6];
		String resultSudong = "";
		String resultJadong = "";
		
		while(great.size()<6) {
			great.add((int)(Math.random()*45)+1);
		} //당첨 번호 생성
		
		
		while(num1.size()<6) {
			num1.add((int)(Math.random()*45)+1);
		} // 내 자동 번호 
		
		
		int[] mylotto = { 8, 11, 27, 31, 40, 43}; // 수동으로 정해진 수
		
		for (int i=0; i<mylotto.length; i++) {
			num2.add(mylotto[i]);
		} // 내 수동 번호 생성
		
		resultJadong = check(great, num1);
		resultSudong = check(great, num2);
		
		
		
		System.out.println("이번주 1등 : " + great);
		System.out.println("=========================================");
		System.out.println("자동 결과 : " + resultJadong +"\n 내 번호 : " + num1 + "\n");
		System.out.println("수동 결과 : " + resultSudong +"\n 내 번호 : " + num2 + "\n");
/*		
		if(great.equals(num1))
			System.out.println("당첨!!! \n당신의 번호 : " + num1);
		else
			System.out.println("1등은 아닌..ㅠㅠ \n당신의 자동 번호 : " + num1);
		
		if(great.equals(num2))
			System.out.println("당첨!!! \n당신의 번호 : " + num2);
		else
			System.out.println("1등은 아닌..ㅠㅠ \n당신의 수동 번호 : " + num2);

		#equals() 메소드로는 1등만 확인 가능 등수 확인 위해 contains() 메소드 활용
*/	
		
	}

}
