package com.biz.word.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.word.vo.WordVO;

/*
 * word.txt 파일을 열어서
 * 문자열을 읽고
 * 콜론(:)을 기준으로 문자열을 나누어서
 * 0 : 영단어
 * 1 : 의미
 * 
 * VO에 담고, 다시 List에 묶어서 return하는 method() 구현
 * getWord();
 */

public class WordService {
	
	String fileName = "src/com/biz/word/word.txt";
	
	FileReader fileReader = null ;
	BufferedReader buffer = null ;
	List<WordVO> list = null ;
	
	public List<WordVO> getWord(){
		
		try {
			fileReader = new FileReader(fileName) ;
			buffer = new BufferedReader(fileReader) ;
			list = new ArrayList<WordVO>();
			String reader = new String();	// 이렇게 선언하면 not null 
			// while 조건문에 reader != null을 선언하려면
			// reader 변수를 문자열 객체로 초기화 해야 한다.
			
			while(reader != null) {
				reader = buffer.readLine();
				// if(reader == null)break;
				
				try {
					String[] sts = reader.split(":");
					
					WordVO vo = new WordVO();
					vo.setId(0);
					vo.setWord(sts[0]);
					vo.setMeaning(sts[1]);
					
					System.out.println(vo);
					list.add(vo);
					
				} catch (Exception e) {
				
				}	
			}
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
		return list ;
	}
	
}