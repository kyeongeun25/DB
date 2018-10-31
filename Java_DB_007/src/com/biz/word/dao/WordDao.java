package com.biz.word.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biz.word.vo.WordVO;

/*
 * DB와 연동을 위해서
 * 연결, CRUD를 구현하는 클래스
 */
public class WordDao {
	// db 연결정보를 보관할 member변수 선언
	Connection conn = null ;
	
	// db 연결을 위한 정보 설정
	String mySqlDriver = "org.gjt.mm.mysql.Driver";
	String url = "jdbc:mysql://localhost:3306/mydb";
	String user = "root";
	String password = "1111";
	
	// 1번 생성자
	// 위에 설정된 정보로 db 연결시작
	public WordDao () {
		this.dbConnect();
	}
	
	// 2번 생성자
	// 사용자 정보(user, password)를 받아서 db연결시작
	public WordDao(String user, String password) {
		this.user = user ; 
		this.password = password ; 
		this.dbConnect();
	}
	
	// 3번 생성자
	// url, user, password 모두 받아서 db 연결시작
	public WordDao(String url, String user, String password) {
		this.url = url ;
		this.user = user ;
		this.password = password ;
		this.dbConnect();
	}
	
	// 데이터연결설정
	private void dbConnect() {
		
		try {
			// Driver Loading
			Class.forName(mySqlDriver);
			
			// Connection 생성
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	// CRUD559717
	// 1. CREAT : insert
	public void insert(String word, String meaning) {
		
		String sql = " insert into word " ;
		sql += " values(0,?,?) " ;
		
		// PreparedStatement : 우리가 보낼 문자열을 MySQL이 알 수 있는 언어로 변환
		PreparedStatement pst = null ;		// 선언
		
		
		try {
			// pst 생성( 문자열 SQL 명령을, DB에 전송하기 전 
			// Connection이나, Driver, DB등이 알아 들을 수 있는 데이터 형태로 변경
			pst = this.conn.prepareStatement(sql);
			pst.setString(1, word);
			pst.setString(2, meaning);
			
			int count = pst.executeUpdate();	// DB에 전송하라
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}
	
	// vo를 이용해서 데이터를 받고
	// insert 실행
	public void insert(WordVO vo) {
		this.insert(vo.getWord(), vo.getMeaning());
	}
	
	public int insert(List<WordVO> list) {
		
		String sql = " insert into word values(0,?,?) " ;
		int count = 0;
		
		try {
			PreparedStatement pst = this.conn.prepareStatement(sql);
			
			for(WordVO vo : list) {
				pst.setString(1, vo.getWord());
				pst.setString(2, vo.getMeaning());
				System.out.println(vo);
				count += pst.executeUpdate();

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count ;
		
	}
	
	// 2. Read : select
	//	  전체 모두 읽기 : selectAll()
	//	  key에 해당하는 레코드 1개 읽기 : selectOne()
	// 전체 데이터를 읽어서 한줄 씩 VO에 담고, List로 묶어서 return
	public List<WordVO> selectAll() {
		
		List<WordVO> wordList = new ArrayList<WordVO>() ;
		
		String sql = " select * from word ";
		try {
			
			PreparedStatement pst = this.conn.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				
				// if(!rs.next()) break ;
				WordVO vo = new WordVO() ;
				vo.setId(rs.getInt("id"));
				vo.setWord(rs.getString("word"));
				vo.setMeaning(rs.getString("meaning"));
				wordList.add(vo);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return wordList ;
		
	}
	
	public void selectOne() {
		
	}


	
}