/*
 * package-info.java를 클래스로 활용 
 */
package com.biz.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.vo.StudentVO;

/*
 * DB와 연동해서 데이터를 
 * 		C : Table에 저장
 * 		R : Table로 부터 데이터를 조회
 * 		U : 데이터를 수정
 * 		D : 데이터를 삭제
 *
 * DB와 연동하기
 * 		DB 연결하기 절차를 수행
 */
public class StudentDao{

	/*
	 *  Dao에서 여러 method()들이
	 *  호출되면서(사용되면서) 쓸 member변수들
	 *  
	 *  그래서 이 member 변수들을 외부에서 접근하지 못하도록 해 주어야 한다.
	 */
	
	// member 변수 한정자(public, private)를 선언하지 않으면
	// 기본값은 public이다.
	// 다만, 패키지가 다른 곳에서 호출을 하면 이때는 제한적으로 private으로 설정이 된다.
	// 같은 패키지 내의 다른 객체에서 호출하면 member변수는 모두 노출된다.
	// 이 클래스 내부에서만 사용할 정보를 담은 변수는 모두 private으로 선언하는 것이 좋다.
	
	
	// DB 연결에 사용할 정보를 변수로 만들어 두자
	private String mySQL = "org.gjt.mm.mysql.Driver";
	private String url = "jdbc:mysql://localhost:3306/mydb";
	private String user = "root";
	private String password = "1111";
	
	// DB 연결할 때 사용할 JDK 클래스를 선언
	private Connection conn = null ;
	
	// SQL을 변환 할 떄 사용할 JDK 클래스를 선언
	private PreparedStatement pst = null ;
	
	// 조회 할 때 결과를 받을 JDK 클래스를 선언
	private ResultSet rs = null ;
	
	// 클래스 이름과 같고 return 형태가 없는 Method
	// >> 생성자
	// 클래스를 객첼 만들때 1번만 conn을 생성하기 때문에
	// DB 연결에 대한 자원을 절약 할 수도 있다.
	public StudentDao() {
		conn = this.dbConnect();
	}
	
	// DB 연동하기(연결하기) method() 생성
	private Connection dbConnect() {
		
		try {
			// Driver 로딩
			Class.forName(mySQL);
			
			// DB와 연결
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {
			System.out.println(mySQL + "드라이버 없음");
		} catch (SQLException e) {
			System.out.println("MySQL 접속 오류");
		}
		return conn;
		
	}
	
	public int insert(StudentVO vo) {
		// conn = dbConnect();
		String sql = " insert into student ";
		sql += " values(0,?,?,?) " ;
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, vo.getId());
			pst.setString(2, vo.getName());
			pst.setInt(3, vo.getAge());
			
			return pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return 0 ;
	}
	
	// 데이터를 추가하기(Create)
	// 추가 명령을 실행하기 전에 먼저 DB 연결을 실행
	public int insert(int num, String name, int age) {
		
		int ret = 0;
		conn = dbConnect() ;	// DB 연결 호출
		String sql = " INSERT INTO student ";
		sql += " VALUES(0,?,?,?) ";
		
		// sql += " VALUES(0," + num +","+name+","+age+")";
		
		// SQL을 변환
		try {
			
			pst = conn.prepareStatement(sql);
			pst.setInt(1, num);
			pst.setString(2, name);
			pst.setInt(3, age);
			
			// insert를 실행
			// insert SQL을 실행한 후
			// 어떤 결과값을 정수형으로 return 해주기 때문에 
			// 그 값을 ret변수에 받아서 insert()를 호출한 곳으로 보내주자
			ret = pst.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("SQL 변환 오류");
		}
		
		return ret ;
		
	}
	
	// 전체 데이터 조회하기(Read, Retrive)
	// 조회 명령을 실행하기 전에 먼저 DB에 연결을 실행(dbConnect();)
	public ResultSet selectAll() {
		
		dbConnect() ;	// DB 연결 호출
		String sql = " SELECT * FROM student " ;
		sql = " SELECT id,num,name,age FROM student " ;
		sql = " SELECT id,num,name,age ";
		sql += " FROM student ";
		
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs ;
	}

	public List<StudentVO> selectVO() {
		String sql = " select * from student " ;
		conn = dbConnect() ;
		List<StudentVO> list = new ArrayList<StudentVO>();
		
		try {
			pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(true) {
				if(!rs.next())break;
					
				StudentVO v = new StudentVO();
				v.setId(rs.getInt("id"));
				v.setNum(rs.getInt("num"));
				v.setName(rs.getString("name"));
				v.setAge(rs.getInt("age"));
				list.add(v);
				
			}
			return list;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	
}