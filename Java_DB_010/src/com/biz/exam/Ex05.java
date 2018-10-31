package com.biz.exam;

import java.util.ArrayList;

import com.biz.exam.vo.StudentVO;

public class Ex05 {

	public static void main(String[] args) {

		// 클래스를 ArrayList에 담기
		// 1. ArrayList 선언
		ArrayList<StudentVO> sts = new ArrayList<StudentVO>();
		
		// 2. 10개의 vo를 sts에 추가
		for(int i = 0 ; i < 5 ; i++) {
			StudentVO v = new StudentVO();
			
			// vo에 값을 setting
			v.setNum(1);
			v.setName("홍길동");
			v.setAge(25);
			v.setTel("01024585488");
			v.setAddr("광주");
			
			
			// ArrayList에 추가
			sts.add(v);
		}
		
		for(StudentVO v : sts) {
			System.out.println(v);
		}

	}

}
