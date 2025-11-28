package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1
		Class.forName("oracle.jdbc.OracleDriver");
		//2
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "jaemin";
		String pwd = "oracle";
		
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		
		//3. 사용(DML 사용)--insert 
		Statement stmt = conn.createStatement();
//		insert into gift values(100, '사탕세트', 100, 3000);
		//String sql = "insert into gift values(200, '초콜릿세트', 200, 5000)";
		//2)레코드값을 입력받아서 처리 - Scanner, IO, main args
		String sql = "INSERT INTO GIFT VALUES("+args[0]+",'"+args[1]+"',"+args[2]+","+args[3]+")";
		System.out.println(sql);
		
		int result = stmt.executeUpdate(sql);
		System.out.println(result + "개 데이터 추가 성공함");
		
		//4. 닫기(자원 반환
		stmt.close();	conn.close();
		
		
		
	}
}
