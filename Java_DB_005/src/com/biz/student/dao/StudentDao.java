package com.biz.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.vo.StudentVO;

public class StudentDao{
	
	private String mySQLDriver = "org.gjt.mm.mysql.Driver";
	private String url = "jdbc:mysql://localhost:3306/mydb";
	private String user = "root";
	private String password = "1111";
	
	Connection conn = null ;
	
	public StudentDao() {
		dbConnection();		// 연결정보 생성
	}	
	
	public StudentDao(String user, String password) {
		this.user = user ;
		this.password = password ;
		dbConnection();		// 연결정보 생성
	}

	public StudentDao(String url, String user, String password ) {
		this.url = url ;
		this.user = user ;
		this.password = password ;
		dbConnection();		// 연결정보 생성
	}


	// DB 연결을 위한 method()
	public void dbConnection() {
		
		try {
			Class.forName(mySQLDriver) ;
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {
			System.out.println(mySQLDriver + "열기 오류");
		} catch (SQLException e) {
			System.out.println("MySQL 접속 오류");
		}
		
	}
	
	
	// 데이터 추가용 method 생성
	// 추가용 method()는 StudentVO에 학생정보를 받아서 
	// student table에 데이터를 추가하고 
	// 추가된 데이터가 있으면 int형 값을 return
	public int insert(StudentVO vo) {
		
		String sql = " INSERT INTO student ";
		sql += " VALUES(?,?,?) " ;
		int ret = 0;
		
		PreparedStatement pst = null ;
		try {
			pst = this.conn.prepareStatement(sql);
			pst.setInt(1, vo.getNum());
			pst.setString(2, vo.getEngName());
			pst.setString(3, vo.getKorName());
			
			ret = pst.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("SQL 생성 오류");
		}
		
		return ret ;
		
	}
	
	public List<StudentVO> getStudent(){
		
		String sql = " SELECT * FROM student ";
		List<StudentVO> stList = null ;
		
		PreparedStatement pst = null ;
		
		try {
			pst  = this.conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			stList = new ArrayList<StudentVO>();
			
			while(true) {
				if(!rs.next()) break ;
				
				StudentVO vo = new StudentVO();
				vo.setNum(rs.getInt("num"));
				vo.setEngName(rs.getString("engName"));
				vo.setKorName(rs.getString("korName"));
				
				stList.add(vo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return stList ;
	}
	
}