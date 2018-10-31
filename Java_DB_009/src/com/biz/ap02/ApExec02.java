package com.biz.ap02;

import java.util.List;

import com.biz.ap02.service.RaffleService;

public class ApExec02 {

	public static void main(String[] args) {

		RaffleService service = new RaffleService();
		List<String> enterList = service.getEnterList();
		List<String> raffleList = service.getRaffle(enterList);
		
		for(String s : raffleList) {
			System.out.println(s);
		}
		

	}

}
