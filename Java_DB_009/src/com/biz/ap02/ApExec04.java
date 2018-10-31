package com.biz.ap02;

/*
 * 피보나치 수열
 * 		규칙 : 앞의 2개의 수를 더한 값이 3번째 수
 * 			1,2 = 3
 * 			1,2,3 = 5
 * 			1,2,3,5 = 8
 * 			...
 */
public class ApExec04 {

	public static void main(String[] args) {

		int fbNum = 0;
		int firstNum = 1;
		int secondNum = 2;
		int sum = 2 ; 
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		while(true) {
			fbNum = firstNum + secondNum ;
			if(fbNum > 100) break;
			if(fbNum % 2 == 0) sum += fbNum;
			System.out.println(fbNum);
			firstNum = secondNum ;
			secondNum = fbNum ;
		}
		System.out.println();
		System.out.println("짝수 합 : "+sum);

	}

}
