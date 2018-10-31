package com.biz.word.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.biz.word.vo.WordVO;

public class WordDao{
	
	private String mySQLDriver = "org.gjt.mm.mysql.Driver";
	private String url = "jdbc:mysql://localhost:3306/mydb";
	private String user = "root";
	private String password = "1111";
	
	Connection conn = null ;
	
	// dbConnect(), insert()
	
	public void dbConnection() {
		try {
			Class.forName(mySQLDriver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println(mySQLDriver + "열기 오류");
		} catch (SQLException e) {
			System.out.println("MySQL 접속 오류");
		}
		
	}
	
	public int insert(WordVO vo) {
		
		String sql = " INSERT INTO word ";
		sql += " VALUES(0,?,?) ";
		int ret = 0;
		
		PreparedStatement pst = null ;
		
		try {
			pst = this.conn.prepareStatement(sql);
			
			pst.setString(1, vo.getWord());
			pst.setString(2, vo.getMeaning());
			
			ret = pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL 생성 오류");
		} catch(Exception e) {
			
		}
		System.out.println(vo);
		return ret;
	}
	
}