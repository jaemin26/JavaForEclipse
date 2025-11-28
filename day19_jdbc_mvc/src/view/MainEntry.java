package view;

import java.sql.SQLException;

import controller.GiftController;
import dbConn.util.ConnectionHelper;

public class MainEntry {
	public static void main(String[] args) throws SQLException { //view
		//ConnectionHelper.menu();
		//ConnectionHelper.getConnection("oracle", "jaemin", "oracle");
		
		GiftController.connect();
		GiftController.menu();
		
	}

}
