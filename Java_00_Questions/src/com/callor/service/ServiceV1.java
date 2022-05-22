package com.callor.service;

// 12번째 페이지
public class ServiceV1 {

	public int scoreSum() {
		int intKor; 
		int intEng;
		int intMath;
		intKor = (int)(Math.random() * 100) + 1;
		intEng = (int)(Math.random() * 100) + 1;
		intMath = (int)(Math.random() * 100) + 1;
		
		int intSum = intKor + intEng + intMath;
		
		return intSum;
	}
	
	
}//end class
