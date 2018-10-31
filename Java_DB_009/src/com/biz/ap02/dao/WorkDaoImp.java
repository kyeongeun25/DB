package com.biz.ap02.dao;

import java.util.List;

import com.biz.ap02.model.WorkVO;

public class WorkDaoImp implements WorkDao {

	/**
	 * @param WorkVO 데이터를 담아오는 곳
	 * @author 506-09
	 * @since 2018-06-27
	 */
	@Override
	public void insert(WorkVO workVO) {
		// TODO 여기는 데이터 추가 코드를 작성하는 곳
		
	}

	@Override
	public List<WorkVO> selectAll() {
		// TODO 여기는 전체 데이터를 조회하는 코드를 작성하는 곳
		return null;
	}

	@Override
	public WorkVO selectOne(int id) {
		// TODO id 조건에 해당하는 1개의 데이터를 조회하는 코드를 작성하는 곳
		return null;
	}

	@Override
	public void update(WorkVO workVO) {
		// TODO VO를 전달받아서 데이터를 수정하는 코드를 작성하는 곳

	}

	@Override
	public void delete(int id) {
		// TODO id 조건에 해당하는 1개의 데이터를 삭제하는 코드를 작성하는 곳

	}

}
