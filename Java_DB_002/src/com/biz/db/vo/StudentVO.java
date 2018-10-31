package com.biz.db.vo;
/*
 * Value Object
 * 	다양한 종류의 데이터를 한 곳에 묶어서 사용, 이동, 전송하기 위해 만드는 클래스
 * 
 */
public class StudentVO {
	
	private int id ;
	private int num ;
	private String name ;
	private int age ;
	
	
	// 기본 생성자
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// member변수 초기화 생성자
	public StudentVO(int id, int num, String name, int age) {
		super();
		this.id = id;
		this.num = num;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
