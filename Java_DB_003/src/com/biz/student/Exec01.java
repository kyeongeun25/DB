package com.biz.student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.biz.student.dao.StudentDao;
import com.biz.student.vo.StudentVO;

public class Exec01 {

	public static void main(String[] args) {
		
		// 데이터 조회만 테스트
		StudentDao dao = new StudentDao();
		
		ResultSet rs = dao.selectAll();
		
		while(true) {
			try {
				if(!rs.next())break;
				System.out.println(rs.getString("name"));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		List<StudentVO> list = dao.selectVO();
		for( StudentVO v : list ) {
			System.out.println(v);
		}

	}

}
