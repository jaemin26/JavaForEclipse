package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class GiftCRUD {
	
	static Scanner sc = new Scanner(System.in);
	static Connection conn;
	
	public static void main(String[] args) throws Exception {
		
		
		while(true) {
			System.out.println("0.전체조회 1.선택조회 2.추가 3.수정 4.삭제 5.종료\n");
			
			switch(sc.nextInt()){
			case 0: selectAll(); break;
			case 1: selectChoice(); break;
			case 2: insert(); break;
			case 3: update(); selectAll(); break;
			case 4: delete(); break;
			case 5: 
				System.out.println("프로그램 종료");
				conn.close();
				System.exit(0);
			
			}//switch
		}// end while
	}
	
	

	private static void delete() throws Exception {
		// TODO Auto-generated method stub
		connection();
		Statement stmt = conn.createStatement();
		System.out.println("삭제할 레코드 gno 는?");
		String str = sc.next();
		stmt.executeQuery("DELETE FROM GIFT WHERE gno=" + str);
		System.out.println("삭제 완료");
		selectAll();
	}



	private static void insert() throws Exception {
		connection();
		Statement stmt = conn.createStatement();
		System.out.println("레코드 추가 gno, gname, g_start, g_end");
		int gno = sc.nextInt();
		String gname = sc.next();
		int g_start = sc.nextInt();
		int g_end = sc.nextInt();
		stmt.executeQuery("INSERT INTO GIFT VALUES("+gno+",'"+gname+"',"+g_start+","+g_end+")");
		System.out.println("레코트 삽입 성공!!");
		selectAll();
		
	}



	private static void selectChoice() throws Exception {
		connection();
		Statement stmt = conn.createStatement();
		System.out.println("데이터 조회할 gno");
		String str = sc.next();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT WHERE gno=" + str);
		while(rs.next()) {
			int gno = rs.getInt("gno");
			String gname = rs.getString("gname");
			int g_s = rs.getInt("g_start");
			int g_e = rs.getInt("g_end");
			System.out.println(gno + "\t" + gname + "\t" + g_s+ "\t" + g_e);
		}
	}



	public static void update() throws Exception {
		connection();
		System.out.println("수정할 번호는?");
		int num = sc.nextInt();
		System.out.println("변경할 상품명, 최저가, 최고가는? ");
		String sql = "update gift set gname=?, g_start=?, g_end=? where gno=?";
		Statement stmt = conn.createStatement();
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, sc.next());
		ps.setInt(2, sc.nextInt());
		ps.setInt(3, sc.nextInt());
		ps.setInt(4, num);
		int result = ps.executeUpdate();
		System.out.println(result + "개 데이터 수정 완료!!!");
		
	}



	public static void selectAll() throws Exception {
		connection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");
		while(rs.next()) {
			int gno = rs.getInt("gno");
			String gname = rs.getString("gname");
			int g_s = rs.getInt("g_start");
			int g_e = rs.getInt("g_end");
			
			System.out.println(gno+"\t"+gname+"\t"+g_s+"\t"+g_e);
		}//while end
		rs.close();
		stmt.close();
	}
	
	public static void connection() throws Exception {
		System.out.println("로딩중");
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "jaemin";
		String pwd = "oracle";
		
		conn = DriverManager.getConnection(url, uid, pwd);
	}

}
