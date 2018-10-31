package com.biz.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {

		String fileName = "data.txt";
		
		FileReader fileReader = null ;
		BufferedReader buffer = null ;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			String line = new String();
			
			while(true) {
				line = buffer.readLine();
				if(line == null) break ;
				
				System.out.println(line);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
