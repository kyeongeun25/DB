package com.biz.ap02.child;


import com.biz.ap02.parent.Animal;

public class Dog extends Animal {
	
	public Dog() {
		this.name = "몽실이";
		this.eat = "양고기사료";
	}
	
	// 상속받은 member변수를 외부에서 접근 할 수 있도록
	// 자식클래스에서 getter와 setter를 만든다.

	public int getLeg() {
		return this.leg;
	}
	
	public int getWeight() {
		return weight ;
	}
	
	public String getName() {
		return this.name;
	}
}