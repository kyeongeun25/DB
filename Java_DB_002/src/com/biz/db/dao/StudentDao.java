package com.biz.db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.biz.db.vo.StudentVO;

/*
 * DAO : Data Access Object
 * 		DB에 데이터를 추가하거나, 조회할때
 * 		사용할 method()들을 모아둔 클래스
 * 
 * 1. DB 연결설정하는 method() : Connection
 * 
 * 	  C, R, U, D
 * 2. INSERT 할 때 호출하는 method(): Data Create
 * 3. SELECT 할 때 호출하는 method(): Data Readable, Retrieve 
 * 4. UPDATE 할 때 호출하는 method(): Data Update
 * 5. DELETE 할 때 호출하는 method(): Data Delete
 */
public class StudentDao {
	
	private String mySQL = "org.gjt.mm.mysql.Driver" ;
	private String url = "jdbc:mysql://localhost:3306/mydb" ;
	private String user = "root" ;
	private String password = "1111" ;
	
	// 1. DB Connection method()
	// 	  DB에 연결하고, 연결정보를 return 해주도록 작성
	//	  DB 연결은 수시로 연결하는 것이 아니고, 한번 연결 한 후에는 Dao내에서 재활용을 한다.
	public Connection getConnection () {
		Connection conn = null ;
		
		try {
			Class.forName(mySQL);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println(mySQL + "열기 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
		
		return conn ;
	}
	
	// Data Create
	// 한 학생의 데이터(StudentVO에 담아서)를 전달받아서 DB에 insert를 실행한다.
	public void insert(StudentVO vo) {
		
	}
	
	// Data Read
	// 1. 전체 데이터를 한꺼번에 조회하는 경우
	public ResultSet selectAll() {
		String sql = "select * from student" ;
		Connection conn = getConnection();
		PreparedStatement pst = null ;
		ResultSet rs = null ;
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	// 2. 한 학생의 데이터만 조회하는 경우
	//	  조회하는 key값을 전달받아서 where로 조건 조회를 한 후 한 학생의 데이터만 return
	public StudentVO selectOne(int key) {
		String sql = "select * from student where id = key" ;
		return null;
	}
	
	// 학생 데이터 전체를 Update
	public void update(StudentVO vo, int key) {
		String sql = "update student Set name = name, age = age, num = num where id = key" ;
	}
	
	// 이름만 Update
	public void update(String name, int key) {
		String sql = "update student Set name = name where id = key" ;
	}
	
	public void updateAge(int age, int key) {
		
	}
	
	public void updateNum(int num, int key) {
		
	}
	
	public void delete(int key) {
		String sql = "delete from student where id = key" ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
