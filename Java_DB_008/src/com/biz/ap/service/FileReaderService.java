package com.biz.ap.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderService {

	private String fileName = "src/com/biz/ap/data.txt";
	private FileReader fileReader = null ;
	private BufferedReader buffer = null ;
	
	List<String> stList = null ;
	
	public FileReaderService() {
		
	}
	
	public FileReaderService(String fileName) {
		this.fileName = fileName ;
	}
	
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public List<String> getStringList() {
		return stList;
	}
	
	public List<String> getStringList(String fileName) {
		this.fileName = fileName;
		this.getFile();
		return stList;
	}

	public List<String> getFile(){
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			stList = new ArrayList<String>();
			
			String reader = new String();
			
			while(true) {
				reader = buffer.readLine();
				if(reader == null) break ;
				stList.add(reader);
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stList ;
	}
	
	
}