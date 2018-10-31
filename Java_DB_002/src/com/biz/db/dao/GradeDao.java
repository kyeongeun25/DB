package com.biz.db.dao;

import java.sql.Connection;
import java.sql.ResultSet;

import com.biz.db.vo.StudentVO;

public interface GradeDao {
	public Connection getConnection () ;
	public void insert(StudentVO vo) ;
	public ResultSet selectAll();
	public StudentVO selectOne(int key);
	public void update(StudentVO vo, int key);
	public void update(String name, int key);
	public void updateAge(int age, int key);
	public void updateNum(int num, int key);
	public void delete(int key);
}
