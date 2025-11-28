package quizCustomer;

import java.util.Scanner;



public class Customer {   // Model
	protected String name;
	protected String address;
	protected String tel;
	static int cnt = 0;

	
	public Customer() {
		if(cnt > 0) {
			System.out.println("customer constructor");
			input();
		}
//		Scanner sc = new Scanner(System.in);
//		System.out.print("name : ");
//		this.name = sc.next();
//		System.out.print("address : ");
//		this.address=sc.next();
//		System.out.print("phone number : ");
//		this.tel=sc.next();	
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("name : ");
		this.name = sc.nextLine();
		System.out.print("address : ");
		this.address=sc.nextLine();
		System.out.print("phone number : ");
		this.tel=sc.nextLine();
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
