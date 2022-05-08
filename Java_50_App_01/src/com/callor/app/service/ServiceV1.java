package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;

public class ServiceV1 {

	/*
	 * final: 이 변수는 딱 한번만 값을 저장할 수 있다.
	 * 하지만 class type의 변수는 그러하지 않는경우도 있다.
	 * class type의 변수에 final을 선언하는 이유는
	 * 한번 초기화된 변수를 다시 초기화하지 못하도록 하는 것이다.
	 * 특히, List type과 같은 많은 데이터를 저장하는 변수들은
	 * final로 선언하는 것을 적극 권장한다.
	 */
	private final List<Integer> intList;
	
	public ServiceV1() {
		intList = new ArrayList<>();
	}//end 생성자
	
	public void makeScore() {
		for(int i =0 ; i < 10 ; i ++) {
			Integer rnd = (int)(Math.random() * 100) + 1;
			intList.add(rnd);
		}// intList 는 final이기 때문에 new 로 다시 초기화 할 수 없다. 
	}//end makeScore
	
	public List<Integer> getIntList() {
		return intList;
	}
		
	
	
}//end class
