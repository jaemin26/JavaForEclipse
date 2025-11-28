package ex05.Switch;

enum Day{ 
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY 
}

public class Enum {
	public static void main(String[] args) {
		
		Day day = Day.FRIDAY;
		
		switch (day) {
	    case MONDAY:
	    case FRIDAY:
	    case SUNDAY:
	        System.out.println(6);
	        break;
	    case TUESDAY:
	        System.out.println(7);
	        break;
	    case THURSDAY:
	    case SATURDAY:
	        System.out.println(8);
	        break;
	    case WEDNESDAY:
	        System.out.println(9);
	        break;
	}
	}

}
