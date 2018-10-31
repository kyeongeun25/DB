package com.biz.grade;

import java.sql.Connection;

import com.biz.grade.dao.GradeDao;

public class Exec01 {

	public static void main(String[] args) {
		
		// dao 클래스를 객체로 생성하기
		GradeDao dao1 = new GradeDao();					
				// 1번 생성자를 호출해서 객체 생성							
				// dao 클래스 내부에서 선언된 기본 접속정보를 사용해서 접속을 만든다.
		GradeDao dao2 = new GradeDao("root", "1111");	
				// 2번 생성자를 호출해서 객체 생성
				// root 사용자명과 1111비밀번호 정보를 사용해서 접속을 만든다.
		
		Connection con3 = dao2.getConn();
		

	}

}
