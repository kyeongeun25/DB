package com.biz.grade.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biz.grade.vo.GradeVO;

/*
 * dao
 * 	데이터베이스와 연결하여 쿼리를 실행 할 때 사용 할 클래스
 */
public class GradeDao{
	
	// 내부에서 사용 할 클래스와 변수를 선언
	Connection conn = null ;
	PreparedStatement pst = null ;
	
	List<GradeVO> grades = null ;
	
	// 접속정보 설정
	String mySqlDriver = "org.gjt.mm.mysql.Driver";
	String url = "jdbc:mysql://localhost:3306/mydb";
	String user = "root";
	String password = "1111";
	
	// 생성자는 외부에서 new 키워드로 객체를 생성 할 때 1번 호출되는 method() 이므로
	// 여기에는 필수적으로 사용되는 객체를 생성하거나 
	// member 변수 값을 세팅하는 코드를 추가해서 사용할수 있다.
	// 1번 생성자
	public GradeDao() {
		
		this.dbConnection();
		
	}
	
	// 외부에서 dao 클래스를 가져다 사용 할 때 혹시 다른 user명, 다른 password로 접속하고자 하면 
	// 생성자에 user명과 password를 전달해주고 초기화 시킬 수 있으면 좋겠다.
	// 2번 생성자
	public GradeDao(String user, String password) {
		
		this.user = user ;
		this.password = password ;
		this.dbConnection();
		
	}
	
	// 사용할 물리적 저장소, 사용자명, 비밀번호를 임의로(다르게)
	// 설정해서 연결을 할 수 있도록 하는 생성자이다.
	// 3번 생성자
	public GradeDao(String url, String user, String password) {
		// this가 붙은 애들이 이 클래스 내에 있는 member변수
		this.url = url ;
		this.user = user ;
		this.password = password ;
		this.dbConnection();
		
	}
	
	
	// connection method 생성
	private void dbConnection() {
		
			try {
				Class.forName(mySqlDriver);
				// this.conn : 이 클래스에 선언된 member 변수
				// 		member변수에 값을 setting 하는 것
				// member 변수에 값을 setting 하면
				// 		클래스 내부의 어디에서나 그 값을 사용 할 수 잇으므로 
				//		dbConnection() 메서드에서 conn 변수 값을 return 할 필요가 없다.
				this.conn = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				System.out.println(mySqlDriver + "열기 오류");
			} catch (SQLException e) {
				System.out.println("MySQL 접속오류");
			}
		
		
	}
	
	// SQL을 실행할 method를 선언
	
	// 외부에서 성적정보를 전달받아서 db 저장
	// 성적정보를 전달받을때 vo 객체에 담아서 전달 받는다.
	public void insert(GradeVO vo) {
		String sql = " insert into grade(num,kor,eng,math) " ;
		sql += " values(?,?,?,?) ";
		
		try {
			pst = this.conn.prepareStatement(sql);
			pst.setInt(1, vo.getNum());
			pst.setInt(2, vo.getKor());
			pst.setInt(3, vo.getEng());
			pst.setInt(4, vo.getMath());
			
			pst.executeUpdate();
			
			
		} catch (SQLException e) {
			System.out.println("SQL 생성 오류");
			
		}
	}

	// 전체 데이터 조회
	public void selectAll() {
		
		String sql = " select * from grade ";
		try {
			pst = this.conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			// member로 선언된 grades를 ArrayList로 생성
			this.grades = new ArrayList<GradeVO>();
			
			// rs로 받은 조회 데이터를 List로 변환
			while(true) {
				
				if(!rs.next())break;
				GradeVO vo = new GradeVO();
				vo.setNum(rs.getInt("num"));
				vo.setKor(rs.getInt("kor"));
				vo.setEng(rs.getInt("eng"));
				vo.setMath(rs.getInt("math"));
				this.grades.add(vo);
				// this.grades는 모든 세팅이 끝났다.
				// this.grades는 member변수이다.
				
			}
			
		} catch (SQLException e) {
			System.out.println("SQL 생성 오류");
		}
		
	}
	
	
	
	public List<GradeVO> getGrades() {
		return grades;
	}

	public Connection getConn() {
		return conn;
	}
	
	
	
}