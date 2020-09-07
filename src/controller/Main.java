package controller;

import java.sql.Connection;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
	// Fill your code
		
		ConnectionManager connectionManager = new ConnectionManager();
		Connection con =connectionManager.getConnection();
		
		if( con != null)
		{
			System.out.println("Connection established");
		}
		else
		{
			System.out.println(" Check your connection");
		}
		
		
	}
}
