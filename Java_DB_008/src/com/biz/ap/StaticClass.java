package com.biz.ap;

public class StaticClass {

	// static 키워드는 클래스를 객체로 생성하지 않아도
	// 호출가능하도록 만드는 키워드
	// JVM(Java Virtual Machine) : 자바로 만든 프로젝트가 실행되는 환경
	// 		이 시작되면서 static으로 되어 있는 method는 미리 생성해서 메모리에 올려두고
	//		언제든지 클래스.method() 형식으로 사용 할 수 있도록 마련해둔다.
	// 그러면, 모든 method를 static으로 선언하면 클래스를 객체로 만드는 수고를 하지 않아도 될텐데
	// 왜 그렇게 하지 않는가?
	// static method는 사용하든 사용하지 않든 항상 메모리 공간을 차지하고 있어서 
	// static method를 많이 만들면 그만큼 메모리 공간이 낭비된다.
	// 그래서 static method는 꼭 필요한 경우만 만들어 사용한다.
	public static void mymethod() {
		System.out.println("나는 static method 입니다. ");
	}
	
}
