package com.biz.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB_02 {

	public static void main(String[] args) {
		String mySQL = "org.gjt.mm.mysql.Driver" ;
		String url = "jdbc:mysql://localhost:3306/mydb" ;
		String user = "root" ;
		String password = "1111" ;
		
		String sql = "select * from student" ;
		
		Connection conn = null ;
		PreparedStatement pst = null ;
		ResultSet rs = null ;
		
		try {
			Class.forName(mySQL);
			conn = DriverManager.getConnection(url, user, password);
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			
			System.out.println("ID\t학번\t이름\t  나이");
			System.out.println("=============================");
			while(true) {
				if(!rs.next())break;
				
				System.out.print(rs.getInt("id")+"\t");
				System.out.print(rs.getInt("num")+"\t");
				System.out.print(rs.getString("name")+"\t  ");
				System.out.println(rs.getInt("age"));
				
				
			}
			rs.close();
			pst.close();
			conn.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
