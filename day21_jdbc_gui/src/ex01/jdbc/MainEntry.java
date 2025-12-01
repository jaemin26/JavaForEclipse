package ex01.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;

public class MainEntry {
	public static void main(String[] args) throws Exception {
		Connection conn = ConnectionHelper.getConnection("oracle");
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			StringBuffer sb = new StringBuffer();
			//sb.append("if exists table drop table kosadb");
			sb.append("CREATE TABLE KOSADB (NAME VARCHAR2(20), AGE NUMBER)");
			System.out.println(sb.toString());
			stmt.executeUpdate(sb.toString()); //반환값이 없는 경우
			
			String sql = "INSERT INTO KOSADB VALUES('yana',33)";
			int result = stmt.executeUpdate(sql);
			sql = "SELECT * FROM KOSADB";
			rs = stmt.executeQuery(sql);
			System.out.println(result + " 개 추가");
			
			while (rs.next()) {
				System.out.println("name : " +rs.getString(1) + "\t");
				System.out.println("age : " +rs.getString("age") + "\t");
			}
			sql = "drop table kosadb";
			result = stmt.executeUpdate(sql);
			System.out.println("drop table" + result);
			
//			String sql = "CREATE TABLE KOSADB (NAME VARCHAR2(20), AGE NUMBER)";
//			int result = stmt.executeUpdate(sql);
//			System.out.println("table create success");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CloseHelper.close(rs);
			CloseHelper.close(stmt);
			CloseHelper.close(conn);
			
		} //try end
	}

}
