package com.callor.app.service;

import java.util.List;

public class ServiceV3 {
	
	private final List<Integer> intList;
	public ServiceV3(List<Integer> intList) {
		this.intList = intList;  
					   //ServiceV3에 의한 intList에 선언된 변수를 뜻함
	}//end 임의생성자
	
	public void makeScore(int length) {
		for(int i = 0; i < length; i ++) {
			int rnd = (int)(Math.random() * 100) + 1;
			this.intList.add(rnd); // return문을쓰지 않고 void로 선언함.
		}
	}

}
