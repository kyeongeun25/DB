package com.biz.grade;

import com.biz.grade.dao.GradeDao;
import com.biz.grade.vo.GradeVO;

public class Exec02 {

	public static void main(String[] args) {
		
		GradeDao dao = new GradeDao();
		
		// 데이터를 입력하기 
		// 19명의 데이터를 임의로 생성해서 
		// INSERT를 해보기
		
		// 학번 2번부터 20번까지 데이터 생성 하기
		for(int i = 2 ; i < 20 ; i++) {
			
			// 50점부터 100점 까지 데이터 생성
			int intKor = (int)(Math.random()*(100-50)+50) ;
			int intEng = (int)(Math.random()*(100-50)+50) ;
			int intMath = (int)(Math.random()*(100-50)+50) ;
			
			// vo에 담기
			GradeVO vo = new GradeVO();
			vo.setNum(i);
			vo.setKor(intKor);
			vo.setEng(intEng);
			vo.setMath(intMath);
			
			// dao에 있는 insert() 메서드에 전달 호출
			dao.insert(vo);
			
		}
		
	}

}
