package ex02.jdbc;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Iterator;

import javax.swing.table.AbstractTableModel;

public class MyModel extends AbstractTableModel {
	
	Object[][] data;
	String[] columnName;
	int rows, cols;
	

	
	public int getRowCount() { // 레코드 개수
		return data.length;
	}

	@Override
	public int getColumnCount() { // 필드(열)의 개수
		
		return columnName.length;
	}
	
	public void getRowCount(ResultSet rsScroll) { // user method
		try {
			rsScroll.last(); // 마지막 레코드로 커서 이동 (레코드 수를 구할 수 있음)
			rows = rsScroll.getRow();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) { //
		
		return data[rowIndex][columnIndex]; //해당 인덱스위치 원자데이터
	}
	
	// DB에 저장된 데이터 채움
	
	public void setData(ResultSet rs) {
		try {
			String title;
			//ResultSet 인스턴스가 가지고 있는 테이블의 정보를 가져옴
			ResultSetMetaData rsmd = rs.getMetaData();
			cols = rsmd.getColumnCount(); //열의개수
			columnName = new String[cols];
			
			for (int i = 0; i < cols; i++) {
				columnName[i] = rsmd.getColumnName(i + 1); // DB 컬럼 1부터 시작
			}
			
			data = new Object[rows][cols];
			int r = 0;
			while (rs.next()) {
				for (int i = 0; i < cols; i++) {
					if (i != 1) data[r][i] = rs.getObject( i + 1); //varchar2 타입
					else data[r][i] = rs.getObject( i +1 ); //number 타입
				} // for end
				r++;
			} // while end
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
