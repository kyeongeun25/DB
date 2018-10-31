package com.biz.exam; 	// 폴더개념
/*
 * 클래스 이름 : 파일이름
 * 1개의 파일에는 1개의 클래스가 원칙
 * 
 */
public class Ex01 {
	
	// 시작점 진입점 method
	public static void main(String[] args) {
		
		// System.out static 클래스
		// println() 메서드를 사용해서 console에 어떤 정보, 데이터를 표시
		System.out.println();
		
		// 변수
		// 어떤 데이터를 메모리에 저장하는데 메모리 주소를 알기가 어렵기 때문에
		// 데이터가 저장된 메모리에 일종의 별명을 붙이고
		// 쉽게 접근(저장/할당, 읽기) 할 수 있도록 만든 것
		
		// 숫자형 변수
		int intNum = 0 ; // 정수 보관
		float fNum = 0 ; // 실수 보관용 변수
		// 4칙연산을 통해서 계산을 할 수 있는 자료형
		
		intNum = 10 + 20 ; 		// 30이 intNum에 저장
		intNum = intNum + 20;	// 원래 intNum에 저장되어 있는 30과 새로운 20의 숫자를 덧셈해서 다시 intNum에 저장하라.
		
		int mod = intNum % 3 ;	// 나눗셈을 수행한 후 나머지를 찾는 연산자

		// 숫자가 짝수인지, 홀수인지 알아볼때
		mod = intNum % 2 ;	// 결과가 0이면 짝수, 0이 아니면 홀수
		if(mod == 0) {
			System.out.println("짝수이다.");
		}else {
			System.out.println("홀수이다.");
		}
		
		// 문자형 변수
		char chName = 'A';  // 한글자를 보관
	
		// 문자열을 취급하기 위해서
		String strName = "홍길동";	// 여러개의 문자를 보관
		

		
		
	}
	
}

