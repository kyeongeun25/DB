package com.biz.student;

import java.util.List;

import com.biz.student.dao.StudentDao;
import com.biz.student.service.StudentService;
import com.biz.student.vo.StudentVO;

public class Exec01{
	
	public static void main(String[] arg) {
	
		StudentDao dao = new StudentDao();
		StudentService service = new StudentService();
		
		// 학생정보 불러오기
		List<StudentVO> stList = service.getStudent();
		
		for(StudentVO vo : stList) {
			dao.insert(vo);
		}
		
	}
	
	
}
