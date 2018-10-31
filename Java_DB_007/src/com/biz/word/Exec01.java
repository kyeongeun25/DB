package com.biz.word;

import com.biz.word.dao.WordDao;

public class Exec01 {
	
	public static void main(String[] args) {
		
		// WordDao의 1번 생성자를 호출해서 객체 생성
		WordDao dao = new WordDao();
		
		// 2번 생성자를 호출해서 객체 생성
		WordDao dao2 = new WordDao("root", "1111");
		
		// 3번 생성자를 호출해서 객체 생성
		String url = "jdbc:mysql://localhost:3306/mydb";
		WordDao dao3 = new WordDao(url, "root", "1111");
		
	}
	
}