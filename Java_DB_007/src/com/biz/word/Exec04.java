package com.biz.word;

import java.time.LocalTime;
import java.util.List;

import com.biz.word.dao.WordDao;
import com.biz.word.service.WordService;
import com.biz.word.vo.WordVO;

public class Exec04 {

	public static void main(String[] args) {
		
		WordService service = new WordService();
		WordDao dao = new WordDao();
		List<WordVO> list = service.getWordList();
		
		LocalTime start = LocalTime.now();
		int count = dao.insert(list);
		LocalTime end = LocalTime.now();
		
		System.out.println("시작시간 : "+start);
		System.out.println("종료시간 : "+end);
		

	}

}
