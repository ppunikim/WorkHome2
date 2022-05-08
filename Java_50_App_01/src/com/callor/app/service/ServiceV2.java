package com.callor.app.service;

import java.util.List;

public class ServiceV2 {
	
	private final List<Integer> intList;
	
	public ServiceV2(List<Integer> intList) {
		this.intList = intList;
	}//end 임의생성자
	
	/*
	 * length 변수를 매개변수로 받아서
	 * length 개수만큼 random 수를 저장한
	 * intList 를 return
	 */
	public List<Integer> getScore(int length) {
		for(int i = 0; i < length; i ++ ) {
			int rnd = (int)(Math.random() * 100 ) + 1;
			intList.add(rnd);
		}
		return intList;
	}//end getScore
	
}//end class
