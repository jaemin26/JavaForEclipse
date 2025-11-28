package view;

import java.io.IOException;
import java.sql.SQLException;

import controller.DeptController;

public class MainEntry {
	public static void main(String[] args) throws SQLException, IOException {
		
		DeptController.connect();
		DeptController.menu();
		
	}

}
