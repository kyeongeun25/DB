package com.biz.ap;

import java.util.List;

import com.biz.ap.service.FileReaderService;

public class App07 {

	public static void main(String[] args) {

		String fileName = "src/com/biz/ap/data1.txt";
		FileReaderService fs = new FileReaderService();
		
		List<String> list = fs.getStringList(fileName);
		
		for(String s : list) {
			System.out.println(s);
		}
		

	}

}
