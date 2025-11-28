package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftSelect {
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
		//반환값이 있는 경우 executeQuery() - select
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT"); // control + shift + x
		System.out.println("상품번호\t상품명\t최저가\t최고가");
		while(rs.next()) {
			int gno = rs.getInt(1);
			String gname = rs.getString("gname");
			int g_s = rs.getInt(3);
			int g_e = rs.getInt("g_end");
			
			System.out.println(gno+"\t"+gname+"\t"+g_s+"\t"+g_e);
		}//while end
		
		//4
		rs.close();
		stmt.close();
		conn.close();
		
		
	}
}
