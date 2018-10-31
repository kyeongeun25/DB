package com.biz.exam;

public class Ex02 {

	public static void main(String[] args) {
		
		int intNum1 = 0 ;
		int intSum = 0 ;
		
		for(int i = 0 ; i < 10 ; i++) {
			intNum1 ++ ;	// intNum를 1씩 증가 시켜라. 10
		}
		System.out.println(intNum1);
		
		intNum1 = 0;
		for(int i = 0 ; i < 10 ; i++) {
			intNum1 ++ ;
			intSum += intNum1 ;		// 1씩 증가되는 값을 intSum에 누적시켜라
			// intSum = 1+2+3+...+10
		}
		
		// 1부터 10까지 덧셈을 하는 코드
		intSum = 0;
		for(int i = 1 ; i <= 10 ; i++) {
			intSum += i ;	// intSum = 1+2+3+...+10
		}

		
		
	}

}
