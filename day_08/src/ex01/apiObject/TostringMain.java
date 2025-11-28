package ex01.apiObject;

class Rectangle {
	
	int x, y;
	
	public Rectangle(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Rectangle() {
		super();
		x = y = 100;
	}

	public void disp() {
		System.out.println(x + "," + y);
	}

	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + "]";
	}
}

public class TostringMain {
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		r.disp();
		
		System.out.println(r);
		System.out.println(r.toString());
	}

}
