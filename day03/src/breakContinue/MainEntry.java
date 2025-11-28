package breakContinue;

public class MainEntry {

	public static void main(String[] args) {
		
		boolean flag = true;
		
		first:{
			second:{
				thrid:{
					
					int k = 100;
					System.out.println("Before the break");//1
					
					if( flag ) break second; 
					
					System.out.println("This won't execute");
					
				}//third
				System.out.println("Java반 홧팅!!");
			}//second
			System.out.println("This is after second break!!");
		}//first
		System.out.println("123456");
	}
}
