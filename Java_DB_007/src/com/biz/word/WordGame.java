package com.biz.word;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.biz.word.dao.WordDao;
import com.biz.word.service.WordService;
import com.biz.word.vo.WordVO;

public class WordGame {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		WordDao dao = new WordDao() ;
		WordService service = new WordService();
		List<WordVO> wordList = dao.selectAll();
		
		while(true) {

			// 순서를 뒤죽박죽하게 생성
			Collections.shuffle(wordList);

			// 1개만 추출
			WordVO word = new WordVO();
			word.setWord(wordList.get(1).getWord());
			word.setMeaning(wordList.get(1).getMeaning());
			
			List<String> scramStr = service.getWord(word.getWord());
			
			System.out.println("~END : 종료");
			System.out.println("다음 의미에 해당하는 단어를 입력하세요.");
			System.out.println("예문 : " + scramStr);
			System.out.println(word.getMeaning());
			System.out.print("단어 >> ");
			String inputWord = scanner.nextLine();
			
			if(inputWord.equals("~END")) break ;
			
			if(inputWord.equalsIgnoreCase(word.getWord())) {
				System.out.println("참 잘했어요");
			}else {
				System.out.println("!!아쉽네요. 정답은  "+word.getWord());
			}

		}
		
	}

}