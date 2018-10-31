package com.biz.student;

import java.util.List;

import com.biz.student.dao.StudentDao;
import com.biz.student.vo.StudentVO;

public class Exec02 {

	public static void main(String[] args) {

		StudentDao dao = new StudentDao();
		List<StudentVO> list = dao.getStudent();
		
		for(StudentVO vo : list) {
			System.out.println(vo);
		}
		

	}

}
