package com.biz.word.vo;
/*
 * 영단어 DB와 연동 할 VO
 * member
 * 	id : primary key
 *  word : 영문자단어
 *  meaning : 우리말 뜻 풀이
 */
public class WordVO {
	
	private int id ;
	private String word ;
	private String meaning ;
	
	
	public WordVO() {
		super();
		// TODO Auto-generated constructor stub
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