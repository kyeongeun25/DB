package com.biz.student.vo;
/*
 * 학생정보 데이터를 저장할 data class
 * 사용자 정의형 자료
 * DB와 관련해서 VO를 디자인 할 때는
 * member변수의 이름을
 * 해당 table의 컬럼명과 같게 하는 것이 좋다.
 * Student Table의 구조
 * 		id int(10),
 * 		num int(3),
 * 		name varchar(20),
 * 		age int(3)
 */
public class StudentVO {

	private int id;
	private int num;
	private String name;
	private int age;
	
	
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	@Override
	public String toString() {
		return "StudentVO [id=" + id + ", num=" + num + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
