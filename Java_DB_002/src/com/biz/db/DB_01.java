package com.biz.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * 1. MySQL Connector Class를 열어서 Loading하기
 * 2. MySQL DBMS에 연결하기
 * 3. SQL 명령 생성
 * 4. SQL 명령 전송하기
 * 5. 결과 받기
 */
public class DB_01 {

	public static void main(String[] args) {
		String mySQL = "org.gjt.mm.mysql.Driver" ;
		
		try {
			// 일반적인 클래스 연결방식이 아닌 Loading 방식으로 클래스를 import
			// 마치 파일을 열어서 사용할 준비를 하는 것과 비슷한 원리
			Class.forName(mySQL);
			
			// MySQL 연결하기 위해서 연결정보를 변수로 설정
			// MySQL 5.7을 사용 할 경우 String url = "jdbc:mysql://localhost:3306/mydb?useSSL=false" ;
			String url = "jdbc:mysql://localhost:3306/mydb" ;
			String user = "root" ;
			String password = "1111" ;
			
			// 연결정보를 가지고 MySQL 접속
			Connection conn = DriverManager.getConnection(url, user, password);
			
			// MySQL에게 전달할 명령문을 작성
			// SQL(Structure Query Language), 쿼리문
			// student table의 데이터 조회 쿼리 만들기
			String sql = "select * from student" ;
			
			// 쿼리문을 MySQL에 전달하기 위해 변환
			PreparedStatement pst = conn.prepareStatement(sql);
			
			// 변환된 SQL 정보를 MySQL로 보내기
			// 지금보낸 SQL은 데이터를 조회하는 명령문이므로 조회된 데이터에 대한 정보를 받아야한다.
			// ResultSet 클래스 형태로 return 되어 온다.
			ResultSet rs = pst.executeQuery();
			
			while(true) {

				// rs.next() 메서드는 데이터를 한줄씩 읽을 준비를 하는데
				// 더 이상 읽을 데이터가 없으면 false를 return한다.
				// rs.next()가 알려주는 값이 true인지, false인지를 판별하여 반복문을 종료하도록 해야 한다.
				boolean ok = rs.next();	// rs데이터의 첫줄을 읽을 수 있도록 준비하라
			
				if(!ok)break;
				
				// rs로부터 데이터의 항목(컬럼)을 하나씩 꺼내 온다.
				// 항목을 꺼낼 때, 항목에 저장된 데이터의 형을 알아야 한다.
				// 문자열:getString(), 숫자:getInt() 메서드로 가져온다.
				System.out.println("ID   : " + rs.getInt("id"));
				System.out.println("학번 : " + rs.getInt("num"));
				System.out.println("이름 : " + rs.getString("name"));
				System.out.println("나이 : " + rs.getInt("age"));
				
			}
			rs.close();
			pst.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(mySQL + "드라이버 읽기 오류");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("MySQL에 접속 할 수 없음");
		}

	}

}
