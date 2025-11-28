package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;
import model.GiftVO;

public class GiftController { // controller : ~~~ DAO
	
	//연결, 삽입, 삭제, 수정, 검색....
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	static Connection conn = null;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	// connect
	public static void connect() {
		try {
			conn = ConnectionHelper.getConnection("oracle");
			stmt = conn.createStatement();
			
			conn.setAutoCommit(false); // 자동커밋 off
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//close
	public static void close() {
		try {
			CloseHelper.close(rs);
			CloseHelper.close(stmt);
			CloseHelper.close(pstmt);
			CloseHelper.close(conn);
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	// menu
	public static void menu() throws SQLException {
		GiftVO vo = new GiftVO();
		
		while( true ) {
			ConnectionHelper.menu();
			
			switch (sc.nextInt()) {
			case 0: System.out.println("Commit 하시겠습니까? Y/N");
					System.out.println("Commit 하지 않으면 Rollback!!!");
					if (sc.next().equalsIgnoreCase("Y")) {
						conn.commit(); // 예외
					} else {
						conn.rollback(); // 예외
						selectAll(vo.getClassName());
					}
					break;
			case 1: selectAll(vo.getClassName()); break;
			case 2: insert(); selectAll(vo.getClassName()); break;
			case 3: break;
			case 4: break;
			case 5: selectByGno(); break;
			case 6: 
				close(); System.out.println("프로그램 종료!!!"); System.exit(0);
			case 7: conn.commit();
					System.out.println("commit 성공!!!");
					break;
			} //end switch
		} // end while
	}
	
	

	// selectAll
	public static void selectAll(String ClassName) {
		try {
			rs = stmt.executeQuery("SELECT * FROM "+ ClassName);
			ResultSetMetaData rsmd = rs.getMetaData();
			int count = rsmd.getColumnCount();
			
			while(rs.next()) {
				for (int i=1; i <= count; i++) { // 각 타입별로 출력
					switch (rsmd.getColumnType(i)) {
					case Types.NUMERIC:
					case Types.INTEGER:
						System.out.println(rsmd.getColumnName(i) + " : " + rs.getInt(i) + " ");
						break;
					case Types.FLOAT:
						System.out.println(rsmd.getColumnName(i) + " : " + rs.getFloat(i) + " ");
						break;
					case Types.DOUBLE:
						System.out.println(rsmd.getColumnName(i) + " : " + rs.getDouble(i) + " ");
						break;
					case Types.CHAR:
						System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + " ");
						break;
					case Types.DATE:
						System.out.println(rsmd.getColumnName(i) + " : " + rs.getDate(i) + " ");
						break;
					default:
						System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + " ");
					} // end switch
				}
				System.out.println();
			} //while end
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	
	
	// selectByGno
	private static void selectByGno() {
		try {
			stmt = conn.createStatement();
			System.out.println("데이터 조회할 gno");
			String str = sc.next();
			rs = stmt.executeQuery("SELECT * FROM GIFT WHERE gno=" + str);
			while(rs.next()) {
				int gno = rs.getInt("gno");
				String gname = rs.getString("gname");
				int g_s = rs.getInt("g_start");
				int g_e = rs.getInt("g_end");
				System.out.println(gno + "\t" + gname + "\t" + g_s+ "\t" + g_e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// insert
	private static void insert() {

		Statement stmt;
		try {
			stmt = conn.createStatement();
			System.out.print("GNO : "); String gno = sc.next();
			System.out.print("GNAME : "); String gname = sc.next();
			System.out.print("G_START : "); String g_start = sc.next();
			System.out.print("G_END : "); String g_end = sc.next();
			
			pstmt = conn.prepareStatement("INSERT INTO GIFT(gno, gname, g_start, g_end) VALUES(?,?,?,?)");
			pstmt.setString(1, gno);
			pstmt.setString(2, gname);
			pstmt.setString(3, g_start);
			pstmt.setString(4, g_end);
			int result = pstmt.executeUpdate();
			System.out.println(result + "개 행 추가 되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		
	}
	
	// update
	
	// updateByGno
	
	private static void updateByGno() {
		try {
			System.out.println("수정할 GNO는?");
			int num = sc.nextInt();
			System.out.println("변경할 상품명, 최저가, 최고가는? ");
			pstmt = conn.prepareStatement("update gift set gname=?, g_start=?, g_end=? where gno=?");
			pstmt.setString(1, sc.next());
			pstmt.setInt(2, sc.nextInt());
			pstmt.setInt(3, sc.nextInt());
			pstmt.setInt(4, num);
			int result = pstmt.executeUpdate();
			System.out.println(result + "개 데이터 수정 완료!!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// deleteAll
	
	// deleteByGno
	
	

}
