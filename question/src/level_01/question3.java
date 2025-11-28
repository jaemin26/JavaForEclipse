package level_01;

import java.util.HashMap;
import java.util.Map;

public class question3 {
	
	public static String[] solution(String[] players, String[] callings) {
		String[] answer = players;
		Map<String, Integer> map = new HashMap<>();
		for ( int i = 0; i < players.length; i++) 
			map.put(players[i], i);
		
		for( int i = 0; i<callings.length; i++) {
			int rank = map.get(callings[i]);
			String name = answer[rank-1];
			answer[rank-1] =answer[rank]; 
			answer[rank] = name;
			map.replace(answer[rank-1], rank-1);
			map.replace(answer[rank], rank);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		String[] players = {"mumu", "seo", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai","mine","mine"};
		String[] result = solution(players, callings);
		
		for (String s : result)
			System.out.print(s + " ");
		
	}

}
