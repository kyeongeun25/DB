package com.biz.ap02.parent;
/*
 * member 변수는 그 클래스를 객체로 생성한 곳에서는
 * 직접 접근하지 못하도록 해야 한다.
 * 1. private 한정시킨다.
 * 2. getter와 setter를 만들어서 접근하도록 한다.
 * 
 * 어떤 클래스를 상속받아서 새로운 클래스를 만들 때는 
 * 간혹, getter와 setter를 통하지 않고 
 * 부모 클래스에 선언된 member변수를 직접 읽고 쓰고 싶을 때가 있다.
 * 	>> 부모의 member변수를 protected로 선언
 * 	1. 상속받은 클래스에서는 직접 접근 가능
 * 	2. 그 클래스를 객체로 생성하여 사용하고자 하는 곳에서는 직접 접근 불가능
 */
public class Animal{
	// 누군가 상속해서 클래스를 디자인 하도록 예정하고 작성하는
	// 클래스의 member변수는 protected로 선언한다.
	protected int leg = 0 ;
	protected String eat = "";
	protected int weight = 0;
	public String name = "";
	
	public void eat() {
		System.out.println(eat + "먹는다");
	}
	
	
	
}