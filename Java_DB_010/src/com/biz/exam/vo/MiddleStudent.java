package com.biz.exam.vo;

// 기존의 StudentVO의 모든기능을 상속해서 사용하고자 할 때 extends
public class MiddleStudent extends StudentVO {

	public String name() {
		return "중학생" ;
	}
	
}