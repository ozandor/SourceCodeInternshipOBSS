package com.obss.ca;

import java.sql.*;

public class CreateTable {
	
	private static final String STATEMENT_CREATE_TABLE = "CREATE TABLE IF NOT EXISTS contacts" + "("
			+ " id int(11) NOT NULL AUTO_INCREMENT," + " first_name varchar(100) NOT NULL,"
			+ " last_name varchar(100) NOT NULL," + " email varchar(45) DEFAULT NULL," + " PRIMARY KEY (id)" + ")";
        	
	
	public static void createTable(Connection conn ) {
		
		PreparedStatement ps1 = null;
		
		try {
        	
        	ps1 = conn.prepareStatement(STATEMENT_CREATE_TABLE);
        	
            ps1.execute();
            
            System.out.println("Contact Table Created !");
        	
        } catch (Exception e) {
        	e.printStackTrace();
        }
	
		
		
	}
	
	
	
}
