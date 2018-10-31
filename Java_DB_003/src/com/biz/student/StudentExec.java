package com.biz.student;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.biz.student.dao.StudentDao;
import com.biz.student.vo.StudentVO;

public class StudentExec {

	// dao 클래스를 객체로 생성해서 사용을 하기
	// main()를 만들자
	
	public static void main(String[] arg) {
		
		// dao 객체 생성
		StudentDao dao = new StudentDao();
		
		// System.out.println(dao.user);
		// System.out.println(dao.password);
		
		// dao.user = "kkk" ;
		
		// System.out.println(dao.user);
		
		// dao에 생성된 method() 호출
		int ret = dao.insert(1, "홍길동", 22);
		System.out.println(ret);
		
		/*
		 * vo를 생성해서 데이터를 실어 보내면(메서드에 전달)
		 * 개별적으로 데이터를 보내는 것에 비해
		 * 1. 코드가 약간 복잡하고 길어지기는 하지만
		 * 2. 각 데이터가 잘못되거나, 순서가 바뀌어 엉뚱하게 insert되는 확률이 그만큼 낮아져서
		 * 	  DB의 신뢰성을 유지 할 수 있다.
		 */
		StudentVO vo = new StudentVO();
		vo.setNum(2);
		vo.setName("이몽룡");
		vo.setAge(33);
		
		dao.insert(vo);
		
		ResultSet rs = dao.selectAll();
	
		while(true) {
			try {
				if(!rs.next())break;
				System.out.print(rs.getInt("id")+"\t");
				System.out.print(rs.getInt("num")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.println(rs.getInt("age")+"\t");

			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	
	
}