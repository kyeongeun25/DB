package com.biz.ap02;

import java.util.ArrayList;
import java.util.List;

import com.biz.ap02.dao.WorkDao;
import com.biz.ap02.dao.WorkDaoImp;
import com.biz.ap02.model.WorkVO;

public class ApExec01 {
	
	public static void main(String[] args) {
		
		WorkDao workDao = new WorkDaoImp();
		WorkVO workVO = new WorkVO();
		List<WorkVO> list = new ArrayList<WorkVO>();
		
		workDao.insert(workVO);
		
	}
	
	
}


