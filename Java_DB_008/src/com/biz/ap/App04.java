package com.biz.ap;

import java.util.List;

import com.biz.ap.service.FileReaderService;

public class App04 {

	public static void main(String[] args) {
		
		// FileReaderService를 사용해서 text 파일을 읽고 
		// 내용을 console에 표시
		
		FileReaderService fs = new FileReaderService();
		
		List<String> sl = fs.getFile();
		
		for(String s : sl) {
			System.out.println(s);
		}
		

	}

}
