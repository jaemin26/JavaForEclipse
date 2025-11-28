package ex03.string;

public class StringMain {
	public static void main(String[] args) {
		
		int x = 3, y = 5;
		
		x = y;
		System.out.println(x +", "+ y);
		
		String s1 = "korea";
		String s2 = "happy";
		System.out.println(s1+ ", " + s2);
		System.out.println("hashcode :"+ s1.hashCode() + "\t hashcode " + s2.hashCode());
		System.out.println("-------------------------------");
		s1 = s2; //참조하는 주소값이 대입됨
		System.out.println(s1+ ", " + s2);
		System.out.println("hashcode :"+ s1.hashCode() + "\t hashcode " + s2.hashCode());
		System.out.println("-------------------------------");
		
		s2 = "seoul";
		System.out.println(s1+ ", " + s2);
		System.out.println("hashcode :"+ s1.hashCode() + "\t hashcode " + s2.hashCode());
		System.out.println("-------------------------------");
		
		s1 = s2; //참조하는 주소값이 대입됨
		System.out.println(s1+ ", " + s2);
		System.out.println("hashcode :"+ s1.hashCode() + "\t hashcode " + s2.hashCode());
		
		
		//String 클래스는 참조값을 같은 상태로 대입해도 새로운 데이터가 생성되면 새로운 데이터의 주소 위치만 변경됨.
		//메모리 낭비를 초래
	}

}
