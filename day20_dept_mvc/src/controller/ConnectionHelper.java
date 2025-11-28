package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {
	//하나의 프로세스에서 공통으로 사용할 수 있는 공용자원 (static)
	
	private static Connection conn;
	
	private ConnectionHelper() {}
	
	public static void menu() {
		System.out.println("\n-=-=-=-=-=-=- JDBC Query -=-=-=-=-=-=-");
		System.out.println("\t 0. rollback");
		System.out.println("\t 1. 전체보기");
		System.out.println("\t 2. 레코드 삽입");
		System.out.println("\t 3. 레코드 수정");
		System.out.println("\t 4. 레코드 삭제");
		System.out.println("\t 5. 조건 검색(ex > gno)");
		System.out.println("\t 6. 프로그램 종료");
		System.out.println("\t 7. commit");
		System.out.println("\t >> 원하는 메뉴 선택하세요.");
	}
	
	
	public static Connection getConnection(String dsn) {
		if (conn != null) {return conn;}
		
		try {
			if (dsn.equals("mysql")) {
				Class.forName("org.gjt.mm.mysql.Driver");
				conn = DriverManager.getConnection(" jdbc:mysql://localhost:3306/sample", "jaemin", "mysql");
			} else if( dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jaemin", "oracle");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
	
	public static void close() throws SQLException {
		if( conn != null ) {
			if( !conn.isClosed() ) {
				conn.close();
			}
		}
	}
	
}
