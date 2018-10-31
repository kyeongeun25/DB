package com.biz.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex09 {

	public static void main(String[] args) {

		// DB에 연결해서 어떤 작업
		// CRUD
		
		// 1. Driver Loading
		// 2. Connection을 생성
		// 3. prepareStatement을 사용해서 SQL 변환
		// 4. 쿼리 실행
		

		try {
			// 1. 드라이버 로딩
			Class.forName("org.git.mm.mysql.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "1111");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM memo");
			ResultSet rs = pst.executeQuery();
			
			while(true){
				if(!rs.next()) break;
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("memo"));
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
