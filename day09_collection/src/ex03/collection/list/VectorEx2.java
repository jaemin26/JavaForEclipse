package ex03.collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEx2 {
	public static void main(String[] args) {
		
		Date date = new Date();
		Vector v = new Vector(3, 5);
		
		v.addElement("자바");
		v.addElement(3.14);
		v.addElement(date);
		
		System.out.println("-------3개 객체 추가");
		System.out.println("size : " + v.size() + " capacity : " +  v.capacity());
		
		for ( int i = 0; i < 10; i++) {
			v.addElement(i);
		}
		System.out.println("-------10개 객체 추가");
		System.out.println("size : " + v.size() + " capacity : " +  v.capacity());
		
		System.out.println("-------vector 내용 출력");
		Enumeration enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + " ");
		}
		
		System.out.println("\n--------객체 내용 포함 확인");
		if(v.contains("자바")) System.out.println("포함");
		else System.out.println("미포함");
		
		System.out.println("3.14 객체 위치? : " + v.indexOf(3.14));
		System.out.println("입력 시간은? : " + date);
		System.out.println(v.get(v.indexOf(date)));
		
		//date object delete
		v.removeElementAt(v.indexOf(date));
		System.out.println(" -------------------- ");
		System.out.println("size : " + v.size() + " capacity : " +  v.capacity());
		System.out.println(v);
		
//		System.out.println("for문으로 전부 지워보기");
//		for ( int i = 0; i < v.size(); i++ ) {
//			v.removeElementAt(i); //지워지는 동시에 인덱스가 앞으로 이동하기 때문에 모든 요소 탐색 불가
//		}
		
		System.out.println("-----------------------");
		v.setElementAt("java", 2);
		enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + " ");
		}
		
		v.trimToSize();
		System.out.println("\nsize : " + v.size() + " capacity : " +  v.capacity());
		
		v.setSize(2); // 크기를 강제로 조정
		System.out.println(v);
		System.out.println("size : " + v.size() + " capacity : " +  v.capacity());
		
	}
}
