package level_01;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class question1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		String fourWords = tmp.substring(tmp.length() - 4, tmp.length());

		if (fourWords.equals("_eye")) {
			System.out.println("Ophthalmologyc");
		} else if (fourWords.equals("head")) {
			System.out.println("Neurousurgery");
		} else if (fourWords.equals("infl")) {
			System.out.println("Orthopedics");
		} else if (fourWords.equals("skin")) {
			System.out.println("Dermatology");
		} else {
			System.out.println("direct recommendation");
		}
		

	}
}



