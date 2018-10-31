package com.biz.grade;

import java.util.List;

import com.biz.grade.dao.GradeDao;
import com.biz.grade.service.GradeService;
import com.biz.grade.vo.GradeVO;

public class Exec03 {

	public static void main(String[] args) {

		// dao 객체로부터 데이터 조회하기
		
		GradeDao dao = new GradeDao();
		
		// 객체의 getter 메서드를 사용하는 방법
		dao.selectAll();
		List<GradeVO> list = dao.getGrades();
		
		// 직접 selectAll()의 메서드로 부터 값을 return 받는 방법
		// 이 경우 selectAll() 메서드의 return값에 List<GradeVO>를 해주고 리턴값을 줘야 한다.
		// List<GradeVO> list1 = dao.selectAll();
		
		// service 객체를 생성해서
		// 총점과 평균을 계산
		GradeService service = new GradeService();
		service.total(list);
		service.avg(list);
		
		for(GradeVO v : list) {
			System.out.println(v);
		}
		
		service.total_avg(list);
		
		
		
		service.total(list, 3);

	}

}
