package com.biz.grade.service;

import java.util.List;

import com.biz.grade.vo.GradeVO;

public class GradeService {

	// 총점 계산을 실행
	// List<GradeVO>를 전달 받아서
	// 총점을 계산
	public void total(List<GradeVO> list) {

		for (GradeVO v : list) {
			int intSum = 0;
			intSum = v.getKor() + v.getEng() + v.getMath();

			// method의 매개변수로 객체나 배열을 전달 받아서
			// 어떤 값으로 변화를 주면
			// 원본 데이터가 수정된다.
			v.setTotal(intSum);
		}

	}

	// 평균 계산
	public void avg(List<GradeVO> list) {
		for (GradeVO v : list) {
			int intSum = v.getTotal();
			v.setAvg(intSum / 3);
		}
	}
	
	// total 메서드를 이름은 유지한채 확장(Upgrade)하고 싶다.
	public void total(List<GradeVO> list, int 과목수) {

		for (GradeVO v : list) {
			int intSum = 0;
			intSum = v.getKor() + v.getEng() + v.getMath();

			// method의 매개변수로 객체나 배열을 전달 받아서
			// 어떤 값으로 변화를 주면
			// 원본 데이터가 수정된다.
			v.setTotal(intSum);
			v.setAvg(intSum/과목수);
		}

	}


	public void total_avg(List<GradeVO> list) {

		for (GradeVO v : list) {
			int intSum = 0;
			intSum = v.getKor() + v.getEng() + v.getMath();

			// method의 매개변수로 객체나 배열을 전달 받아서
			// 어떤 값으로 변화를 주면
			// 원본 데이터가 수정된다.
			v.setTotal(intSum);
			v.setAvg(intSum/3);
		}

	}
}