package dbConn.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//if( rs != null ) rs.close();
//if( stmt != null ) stmt.close();
//if( pstmt != null ) pstmt.close();
//if( conn != null ) conn.close();

public class CloseHelper {
	public static void close ( Connection conn ) throws Exception {
		if( conn != null ) conn.close();
	}
	
	public static void close ( Statement stmt ) throws Exception {
		if( stmt != null ) stmt.close();
	}
	
	public static void close ( PreparedStatement pstmt ) throws Exception {
		if( pstmt != null ) pstmt.close();
	}
	
	public static void close ( ResultSet rs ) throws Exception {
		if( rs != null ) rs.close();
	}
	

}
