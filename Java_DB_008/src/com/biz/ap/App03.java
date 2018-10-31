package com.biz.ap;

import com.biz.ap.dao.StudentDao;
import com.biz.ap.dao.StudentDaoImp;

public class App03 {

	public static void main(String[] args) {

		// 클래스를 객체로 생성
		StudentDaoImp s = new StudentDaoImp();
		
		// 인터페이스가 있는 클래스는 인터페이스로 선언하고, 클래스로 생성한다.  
		StudentDao s1 = new StudentDaoImp();

	}

}
