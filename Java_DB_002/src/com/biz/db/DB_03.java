package com.biz.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.biz.db.dao.StudentDao;

public class DB_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// StudentDao를 이용해서 데이터 조회하기
		
		StudentDao dao = new StudentDao();
		ResultSet rs = dao.selectAll();
		
		try {
			while(true) {
			
				if(!rs.next()) break;
				System.out.println("ID : "+rs.getInt("id"));
				System.out.println("학번 : "+rs.getInt("num"));
				System.out.println("이름 : "+rs.getString("name"));
				System.out.println("나이 : "+rs.getInt("age"));
			}
		} catch (SQLException e) {
						
		}
	}

}



