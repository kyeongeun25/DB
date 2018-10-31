package com.biz.exam;

import com.biz.exam.vo.MiddleStudent;
import com.biz.exam.vo.StudentVO;

public class Ex06 {

	public static void main(String[] args) {

		StudentVO vo = new StudentVO();
		System.out.println(vo.name()+"입니다.");
		
		MiddleStudent ms = new MiddleStudent();
		System.out.println(ms.name()+"입니다.");

	}

}
