package com.biz.student.vo;


/*
 * member변수 생성
 * 학번
 * 영어이름
 * 한글이름
 * 
 */
public class StudentVO{
	
	private int num ;
	private String engName ;
	private String korName ;
	
	
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentVO(int num, String engName, String korName) {
		super();
		this.num = num;
		this.engName = engName;
		this.korName = korName;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getEngName() {
		return engName;
	}
	public void setEngName(String engName) {
		this.engName = engName;
	}
	public String getKorName() {
		return korName;
	}
	public void setKorName(String korName) {
		this.korName = korName;
	}
	@Override
	public String toString() {
		return "StudentVO [num=" + num + ", engName=" + engName + ", korName=" + korName + "]";
	}
	
	
	
	
	
}