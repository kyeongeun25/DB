package com.biz.ap;

import com.biz.ap.vo.StudentVO;

public class App02 {

	public static void main(String[] args) {
		
		// 클래스를 객체로 만드는 절차
		// 클래스를 객체로 만들면, JVM 객체를 메모리 어딘가에 위치해놓고
		// 언제든지 사용 할 수 있도록 준비해준다.
		StudentVO studentVO = new StudentVO();	// 생성자 1을 사용해서 객체 생성
		
		// member변수를 초기화하는 생성자를 호출
		StudentVO st2 = new StudentVO("홍길동","111", "광주", 22);	// 생성자 2를 사용해서 객체 생성
		
		
	}
}
