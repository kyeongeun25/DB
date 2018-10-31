package com.biz.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HelloDB01 {

	public static void main(String[] args) {
		//org.gjt.mm.mysql
		String dbClass = "org.gjt.mm.mysql.Driver" ;
		
		Connection dbCon = null ;
		PreparedStatement ps = null ;
		
		String url = "jdbc:mysql://localhost:3306/mydb";
		String userName = "root";
		String userPassword = "1111";
		
		try {
			Class.forName(dbClass);
			
			dbCon = DriverManager.getConnection(url, userName, userPassword);
			ps = dbCon.prepareStatement("select * from student");
			
			
			
			ResultSet rs = ps.executeQuery();
			
			while(true) {
				
				if(rs.next()==false)break;
				
				int id = rs.getInt("id");
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				System.out.print(id+"\t");
				System.out.print(num+"\t");
				System.out.print(name+"\t");
				System.out.print(age+"\n");
				
				
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
