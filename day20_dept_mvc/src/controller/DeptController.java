package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;
import model.deptVO;

public class DeptController {
	
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

		// close
		public static void close() {
			try {
				CloseHelper.close(rs);
				CloseHelper.close(stmt);
				CloseHelper.close(pstmt);
				CloseHelper.close(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void menu() throws SQLException, IOException {
			deptVO vo = new deptVO();

			while (true) {
				ConnectionHelper.menu();

				switch (sc.nextInt()) {
				case 0:
					System.out.println("Commit 하시겠습니까? Y/N");
					System.out.println("Commit 하지 않으면 Rollback!!!");
					if (sc.next().equalsIgnoreCase("Y")) {
						conn.commit(); // 예외
					} else {
						conn.rollback(); // 예외
						selectAll(vo.getClassName());
					}
					break;
				case 1:
					selectAll(vo.getClassName());
					break;
				case 2:
					insert();
					selectAll(vo.getClassName());
					break;
				case 3:
					updateByGno(vo.ClassName);
					break;
				case 4:
					delete(vo.getClassName());
					break;
				case 5:
					selectByGno(vo.getClassName());
					break;
				case 6:
					close();
					System.out.println("프로그램 종료!!!");
					System.exit(0);
				case 7:
					conn.commit();
					System.out.println("commit 성공!!!");
					break;
				} // end switch
			} // end while
		}

		private static void delete(String className) throws SQLException {
			selectAll(className);
			System.out.println("삭제할 DEPTNO 입력 : ");
			String deptno = sc.next();
			pstmt = conn.prepareStatement("DELETE FROM "+className+ " WHERE DEPTNO=?");
			pstmt.setString(1, deptno);
			pstmt.execute();
			selectAll(className);
		}

		private static void updateByGno(String className) throws SQLException {
			a: while (true) {
				selectAll(className);
				String modify = null;
				System.out.println("0선택 ==> update escape");
				System.out.println("수정할 DEPTNO : ");
				int deptno = sc.nextInt();

				b: while (true) {
					System.out.println("\n\n 1.DNAME \t 2.LOC t0.EXIT \t(DEPTNO IS NOTNULL)");
					System.out.println("수정할 컬럼 선택 : ");
					int choice = sc.nextInt();
					String up;
					switch (choice) {
					case 1:
						System.out.println("수정할 DNAME : ");
						up = sc.next();
						stmt.execute("update " + className + " set dname = '" + up + "' where deptno = " + deptno);
						
						break b;
					case 2:
						System.out.println("수정할 LOC : ");
						up = sc.next();
						stmt.execute("update " + className + " set loc = " + up + " where deptno = " + deptno);
						break b;
					case 0:
						break a;
					default:
						System.out.println("잘못된 번호입니다.");
						break;
					} // switch end
					c: switch (choice) {
					case 1:
						modify = "DNAME"; break c;
					case 2:
						modify = "LOC"; break c;
					}
					System.out.println(modify + "수정이 완료 되었습니다.");
				} // in while
			} // while
			
		}

		private static void insert() {
			try {
				System.out.print("DEPTNO : ");
				String deptno = sc.next();
				System.out.print("DNAME : ");
				String dname = sc.next();
				System.out.print("LOC : ");
				String loc = sc.next();
		

				pstmt = conn.prepareStatement("INSERT INTO dept(deptno, dname, loc) VALUES(?,?,?)");
				pstmt.setString(1, deptno);
				pstmt.setString(2, dname);
				pstmt.setString(3, loc);
				int result = pstmt.executeUpdate();
				System.out.println(result + "개 행 추가 되었습니다.");

			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

		private static void selectAll(String className) {
			try {
				rs = stmt.executeQuery("SELECT * FROM " + className);
				ResultSetMetaData rsmd = rs.getMetaData();
				int count = rsmd.getColumnCount();

				while (rs.next()) {
					for (int i = 1; i <= count; i++) { // 각 타입별로 출력
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
				} // while end
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		private static void selectByGno(String className) {
			try {
				System.out.println("데이터 조회할 deptno");
				String deptno = sc.next();
				pstmt = conn.prepareStatement("SELECT * FROM " + className + " WHERE DEPTNO = ?");
				pstmt.setString(1, deptno);
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {
					deptno = rs.getString("deptno");
					String gname = rs.getString("dname");
					String loc = rs.getString("loc");
					System.out.println(deptno + "\t" + gname + "\t" + loc);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
