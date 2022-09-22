package com.obss.ca;

import java.sql.*;

public class MainDriver {
	
	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/db_jss?useSSL=false";
        String user = "dbuser";
        String password = "dbuser123";

        try {
            
        	System.out.println("Connecting to db...");
            Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
            
        	System.out.println("Connection successfull...");
            
            CreateTable.createTable(conn);
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
        
        
	
	}

}
