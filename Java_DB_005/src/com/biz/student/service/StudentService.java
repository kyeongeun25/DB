package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.vo.StudentVO;

/*
 * names.txt 파일을 열어서 
 * 문자열을 읽어 들이고
 * 콜론(:)을 기준으로 문자열을 분해해서
 * 학번, 영문이름, 한글이름으로 나누고
 * 
 * 그 정보를 StudentVO에 담고
 * 다시 List로 묶어서 List<StudentVO>를
 * return 하는 method()fmf 작성
 */

public class StudentService{
	
	String fileName = "src/com/biz/student/names.txt" ;
	
	FileReader fileReader = null ;
	BufferedReader buffer = null ;
	
	// Arraylist 클래스를 Collection 자료형이라고 하는데,
	// Collection 자료형의 가장 상위(부모) 클래스는 
	// List클래스
	// Collection 자료형들은 일반적으로 사용 할 때 
	// List로 선언을 하고
	// 사용할 객체로 초기화를 한다.
	List<StudentVO> stList = null ;
	
	
	public List<StudentVO> getStudent(){

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			stList = new ArrayList<StudentVO>();
			
			String reader = new String();
			while(true) {
				reader = buffer.readLine();
				if(reader == null)break ; 	// 다 읽었으면 종료
			
				
				try {

					// 문자열 분해
					String[] sts = reader.split(":");
					
					StudentVO vo = new StudentVO();
					vo.setNum(Integer.valueOf(sts[0]));
					vo.setEngName(sts[1]);
					vo.setKorName(sts[2]);
					stList.add(vo);

				} catch (Exception e) {
					// 만약 try 내부에서 오류가 발생해도 
					// 아무런 처리 없이 그냥 무시하라
				}
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(fileName + "파일 열기 오류");
		} catch (IOException e) {
			System.out.println("문자열 읽기 오류");
		}catch(Exception e) {
			
		}
		
		
		return stList;
	}


	public List<StudentVO> getStList() {
		return stList;
	}
	
	
	
}