package com.biz.ap02.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * enter.txt 파일을 열어서 사람들의 이름을 읽어들이고
 * 응모자 중에서 3명만 추첨하는 서비스
 */
public class RaffleService{
	
	String fileName = "src/com/biz/ap02/enter.tx";
	FileReader fileReader = null ;
	BufferedReader buffer = null ;
	List<String> enterList = null ;
	
	/*
	 * 파일을 읽어서 응모자의 이름을 추출하고 List<String> 형으로 결과를 return
	 */
	public List<String> getEnterList() {
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			enterList = new ArrayList<String>();
			String line = new String();
			
			
			
			while(true) {
			
				line = buffer.readLine();
				if(line == null) break ;
				enterList.add(line);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return enterList ;
	}
	
	// List<String>에 응모자를 전달 받아서 3명의 당첨자를 선정하고 
	// 다시 List<String>에 담아서 return하는 method
	// method명 getRaffle, shuffle한 값을 받는 리스트 변수명 retList
	public List<String> getRaffle(List<String> enterList){
		
		List<String> retList = new ArrayList<String>();
		Collections.shuffle(enterList);

		for(int i =0 ; i < 3 ; i++) {
			retList.add(enterList.get(i));
		}
		return retList;
		
	}
	
	
	
}