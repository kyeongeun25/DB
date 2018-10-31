package com.biz.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * MySQL DB에 연결해서 데이터 가져오기
 * 
 * 1. MySQL 클래스 선언
 * 		일반적인 클래스를 객체로 생성하는 부분과는 다르다.
 * 2. URL 선언
 * 3. SQL 생성
 * 4. SQL 실행
 * 5. DB close
 */
public class HelloDB {

	public static void main(String[] args) {
		// org.gjt.mm.mysql
		// 1. MySQL 클래스 선언
		// 		>> 클래스  Loading
		try {
			// mysql connector 클래스를 내 프로젝트에서 사용하기 위해 열어라 !!
			Class.forName("org.gjt.mm.mysql.Driver");
			// 일반적인 file 열기와 비슷한 역할이지만
			// Text, BIN 파일이 아닌 클래스 파일을 가져오라는 명령
			
			// DB 연결정보를 설정
			String url = "jdbc:mysql://localhost:3306/mydb";
			String userName = "root";
			String userPassword = "1111";
			
			Connection dbCon = null ;
			
			// db 연결시도
			dbCon = DriverManager.getConnection(url,userName,userPassword);
			
			// SQL 생성
			// 예) select를 실행해보기
			String sql = "select * from student";
			PreparedStatement ps = null ;
			
			// SQL을 실행할 준비를 하라
			ps = dbCon.prepareStatement(sql);
			
			// Scanner을 이용한 출력
			// ps = dbCon.prepareStatement(scanner.nextLine());
			
			// DB연결해서 실행하고 결과 가져오기
			ResultSet rs = ps.executeQuery();
			// >> select된 결과를 rs에 담기
			
			// rs에 들어있는 값을 콘솔에 보이기
			// 반복문을 이용해서 한레코드씩 가져오기 할 예정
			// 가져온 데이터의 레코드가 몇개인지 모르기 때문에
			// while을 이용해서 반복처리
			while(true) {
				// ResultSet에 있는 한레코드를 가져와라
				// 더이상 가져올 레코드가 없으면 false return
				// if(!rs.next()) break;
				if(rs.next() == false )break;
				
				int id = rs.getInt("id");	// id 가져오기
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				System.out.println(id+"\t"+num +"\t"+name+"\t"+age);
			}
			
			// db닫기
			dbCon.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
