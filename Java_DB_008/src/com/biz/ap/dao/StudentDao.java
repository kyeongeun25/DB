package com.biz.ap.dao;

import java.util.List;

import com.biz.ap.vo.StudentVO;

/*
 * interface는 실제 어떤 기능을 수행하는 클래스가 아니다.
 * 다른 클래스를 작성(디자인)하는데 규칙을 담고 있는 클래스다.
 * 
 */

public interface StudentDao{
	
	public void dbConnect();
	// Dao의 필수 메서드 5개
	public int insert(StudentVO vo) ;		// 데이터 추가
	public List<StudentVO> selectAll() ;	// 전체 데이터 조회
	public StudentVO selectOne(int id);		// 1개 데이터 조회
	public void update(StudentVO vo);		// 수정하기
	public void delete(int id);				// 삭제하기
	
	
	
}