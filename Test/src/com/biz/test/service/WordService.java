package com.biz.test.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordService{
	
	public List<String> getWordList(){
		
		String fileName = "src/com/biz/test/test.txt";
		FileReader fileReader = null ;
		BufferedReader buffer = null ;
		List<String> wordlist = null ;
		
		try {
			fileReader = new FileReader(fileName) ;
			buffer = new BufferedReader(fileReader) ;
			wordlist = new ArrayList<String>();
			String reader = new String();
			
			while(true) {
				reader = buffer.readLine();
				if(reader == null) break ;
				wordlist.add(reader);
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
	
	public List<String> getSplitWordList(List<String> wordlist){
		
		String word = new String();
		String[] words =  wordlist.toArray(new String[wordlist.size()]);
		
		
		
		
		return null;
	}
	
}