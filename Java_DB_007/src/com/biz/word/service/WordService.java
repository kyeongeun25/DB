package com.biz.word.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.biz.word.vo.WordVO;

/*
 * word.txt 파일을 열어서
 * 문자열을 읽고
 * 각 문자열을 콜론(:)을 기준으로 분해한 후
 * WordVO에 담고, 다시 List<WordVO>로 묶어서
 * return하는 method를 추가
 */

public class WordService {
	
	String fileName = "src/com/biz/word/word.txt" ;
	
	FileReader fileReader = null ;
	BufferedReader buffer = null ;

	// 파일에서 읽은 정보를 return 하기 위한 member변수
	List<WordVO> wordlist = null ;
	
	public List<WordVO> getWordList() {
		
		try {
			// 파일 읽기
			fileReader = new FileReader(fileName) ;
			buffer = new BufferedReader(fileReader) ;
			wordlist = new ArrayList<WordVO>() ;
			
			// 문자열 읽어 보관할 문자열 객체 생성
			String reader = new String();
			while(true) {
				reader = buffer.readLine();
				if(reader == null) break ;
				
				String[] words = reader.split(":");
				WordVO vo = new WordVO() ;
				
				// 혹시 문자열을 split했는데 
				// 결과가 원하지 않는 형태일 때 해당하는 data만 skip
				try {
				
					vo.setWord(words[0]);
					vo.setMeaning(words[1]);
					
					wordlist.add(vo);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return wordlist ;
		
	}
	
	// 단어를 알파벳으로 분해해서 뒤섞은 다음 리턴
	public List<String> getWord(String word){
		String[] words = word.split("");	// 알파벳 자르기
		
		// 배열을 바로 List로 변환
		List<String> list = new ArrayList<String>(Arrays.asList(words));
		
		Collections.shuffle(list);
		
		return list;
		
	}
	
}