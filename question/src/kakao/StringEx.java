package kakao;

//카카오 코테 신규아이디 추천

public class StringEx {

	public static String solution(String new_id) {
		String answer = "";

		answer = new_id.toLowerCase();
		answer = answer.replaceAll("[^a-z0-9-_.]", ""); // 정규표현식
		while (answer.contains("..")) {
			answer = answer.replace("..", ".");
		}

		if (answer.charAt(0) == '.') {
			answer = answer.substring(1);
		}
		if (answer.isEmpty()) {
			answer = "a";
		}
		if (answer.length() > 16) {
			answer = answer.substring(0, 15);
			if (answer.charAt(answer.length() - 1) == '.')
				answer = answer.substring(0, 15);
		}

		while ((answer.length() < 3)) {
			answer += answer.charAt(answer.length()-1);
		}

		return answer;

	}

	public static void main(String[] args) {
		String result, result2;
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		String new_id2 = "a";
		result = solution(new_id);
		result2 = solution(new_id2);
		System.out.println(result + "\n" + result2);

	}
}
