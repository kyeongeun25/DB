package com.biz.exam;

import com.biz.exam.vo.StudentVO;

public class Ex04 {

	public static void main(String[] args) {

		// 클래스 배열은 배열을 생성해도 바로 접근(읽기, 쓰기)가 불가능
		StudentVO[] sts =  new StudentVO[10];
		
		// 다시 요소를 생성해주어야 한다.
		for(int i = 0 ; i < sts.length ; i++) {
			sts[i] = new StudentVO();
		}
		

	}

}
