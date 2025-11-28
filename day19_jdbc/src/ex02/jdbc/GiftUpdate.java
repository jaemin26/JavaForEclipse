package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;



public class GiftUpdate{
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1
		Class.forName("oracle.jdbc.OracleDriver");
				//2
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "jaemin";
		String pwd = "oracle";
				
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		//3 사용(DML 사용) - select
		Statement stmt = conn.createStatement();
		
		String sql = "update gift set gname=?, g_start=?, g_end=? where gno=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, "자전거");
		ps.setInt(2, 700);
		ps.setInt(3, 800);
		ps.setInt(4, 8);
		int result = ps.executeUpdate();
		System.out.println(result + "개 데이터 수정 완료!!!");
		
		stmt.close(); conn.close();
			
	}
}