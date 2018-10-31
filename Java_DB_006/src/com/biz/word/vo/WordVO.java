package com.biz.word.vo;

public class WordVO {
	
	private int id ;
	private String word ;
	private String meaning ;
	
	
	
	
	public WordVO() {
		
	}
	
	public WordVO(int id, String word, String meaning) {
		super();
		this.id = id;
		this.word = word;
		this.meaning = meaning;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	@Override
	public String toString() {
		return "WordVO [id=" + id + ", word=" + word + ", meaning=" + meaning + "]";
	}
	
	
	
	
}