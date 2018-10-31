package com.biz.ap.vo;

// VO class
// 여러 형태의 변수들을 하나의 묶음으로 만들어
// 다른 method에 전달하거나 method로 부터 return 받는 용도로 사용하는 class
// User Define Value(Varriable) : 사용자 정의 자료형
// VO 클래스는 기본적으로 member변수가 중요한 기능을 한다.
// member변수는 항상 private로 선언하고 member변수에 접근 할 수 있는 getter setter를 생성해둔다.
// 실제 VO class는 member변수를 위해서 만든 클래스이다.

public class StudentVO{
	
	private String strName ;
	private String strTel ;
	private String strAddr ;
	private int age ;
	
	
	// 생성자는 return 자료형 지정이 없는데
	// 생성자가 return 하는 값은 현재 클래스의 객체
	// 생성자를 호출 할 때는 new 키워드로 호출한다.
	// 생성자 1
	// 기본 생성자는 다른 생성자가 없으면 별도로 만들지 않아도 자동으로 만들어 지지만,
	// 생성자 2 처럼 별도의 다른 생성자를 만들면 반드시 기본 생성자도 만들어 주어야 한다.
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// 생성자 2
	public StudentVO(String strName, String strTel, String strAddr, int age) {
		super();
		this.strName = strName;
		this.strTel = strTel;
		this.strAddr = strAddr;
		this.age = age;
	}
	public String getStrName() {
		return strName;
	}
	
	// setter method는 객체의 member 변수를 보호하는 용도로 사용한다.
	// member변수를 보호한다? >> 외부에서 member변수에 값을 저장하려고 할 때
	//							 범위나 형태를 잘못 저장하는 경우 setter에서 그 값을 검사하고, 저장한다.
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrTel() {
		return strTel;
	}
	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}
	public String getStrAddr() {
		return strAddr;
	}
	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0 || age > 200) {
			System.out.println("나이는 0보다 크고 200보다 작아야 한다.");
			return ;	// 저장하지 말고 끝내라
		}
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentVO [strName=" + strName + ", strTel=" + strTel + ", strAddr=" + strAddr + ", age=" + age + "]";
	}
	
	
	
	
}