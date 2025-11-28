package ex02.collection.set;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet(); //자동정렬된다.
		
		int[] score = { 100, 50, 77, 26, 9, 100, 200};
		
		for ( int i=0; i<score.length; i++) {
			set.add(score[i]);
		}
		
		System.out.println(set);
		
		System.out.println("50보다 작은 값 : " + set.headSet(50));
		System.out.println("50보다 큰 값 : " + set.tailSet(50));
		
		TreeSet set2 = new TreeSet();
		String[] str = {"aa","az","za","ab","zz"};
		
		for ( int i=0; i<str.length; i++) {
			set2.add(str[i]);
		}
		System.out.println(set2);
	}

}
