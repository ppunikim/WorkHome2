package com.callor.app.service;

public class ServiceV4 {
	
	private final int[] intArray;
	public ServiceV4(int[] intArray) {
		this.intArray = intArray;  // this는 ServiceV4를 말함
	} //end 임의 생성자
	
	public void makeScore() {
		for(int i = 0; i < intArray.length; i ++) {
			int rnd = (int)(Math.random() * 100) + 1;
			intArray[i] = rnd;
		}//end for
	}//end makeScore()
	
}//end class
