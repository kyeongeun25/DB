package com.biz.grade.vo;

/*
 * 성적처리용 VO 클래스 생성
 */

public class GradeVO{
	
	// 성적처리 데이터를 담기위한 member변수를 선언
	private int num ;	// 학번
	private int kor ;	// 국어점수
	private int eng ;	// 영어점수
	private int math ;	// 수학점수
	private int total ;	// 총점
	private int avg ;	// 평균
	
	
	
	public GradeVO(int num, int kor, int eng, int math, int total, int avg) {
		super();
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
	}
	public GradeVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "GradeVO [num=" + num + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total
				+ ", avg=" + avg + "]";
	}
	
	
}
