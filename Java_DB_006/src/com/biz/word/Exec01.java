package com.biz.word;

import java.util.List;

import com.biz.word.dao.WordDao;
import com.biz.word.service.WordService;
import com.biz.word.vo.WordVO;

public class Exec01 {

	public static void main(String[] args) {

		WordDao dao = new WordDao();
		WordService service = new WordService();
		
		List<WordVO> list = service.getWord();
		
		for(WordVO vo : list) {
			dao.insert(vo);
		}
		

	}

}
