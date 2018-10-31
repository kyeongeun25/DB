package com.biz.word;

import java.time.LocalTime;
import java.util.List;

import com.biz.word.dao.WordDao;
import com.biz.word.service.WordService;
import com.biz.word.vo.WordVO;

public class Exec03 {

	// 자바의 시작점 method, 진입점 method
	public static void main(String[] args) {
		
		WordService service = new WordService();
		WordDao dao = new WordDao();
		
		List<WordVO> list = service.getWordList();
		
		LocalTime startTime = LocalTime.now();
		for(WordVO vo : list) {
			System.out.println(vo);
			dao.insert(vo);
		}
		LocalTime endTime = LocalTime.now();
		
		System.out.println("총 단어 개수 : "+list.size());
		System.out.println("시작시간 : " +  startTime);
		System.out.println("종료시간 : "+endTime);


	}

}
