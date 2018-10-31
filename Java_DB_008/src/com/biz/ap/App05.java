package com.biz.ap;

import java.util.List;

import com.biz.ap.service.FileReaderService;

public class App05 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/ap/data1.txt";
		FileReaderService fs = new FileReaderService(fileName);
		List<String> list  = fs.getFile();
				
		for(String s : list) {
			System.out.println(list);
		}

		
		
	}

}
