package com.biz.ap02.model;

public class WorkVO{
	
	private int id ;
	private String workName ;
	private String wordMemo ;
	
	
	public WorkVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WorkVO(int id, String workName, String wordMemo) {
		super();
		this.id = id;
		this.workName = workName;
		this.wordMemo = wordMemo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWorkName() {
		return workName;
	}
	public void setWorkName(String workName) {
		this.workName = workName;
	}
	public String getWordMemo() {
		return wordMemo;
	}
	public void setWordMemo(String wordMemo) {
		this.wordMemo = wordMemo;
	}
	
	
	
	
}