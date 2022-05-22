package com.callor.controller;

import com.callor.service.ServiceV1;

// 12 page
public class ControllerV1 {
	public static void main(String[] args) {
		
		ServiceV1 sV1 = new ServiceV1();
		int result = sV1.scoreSum();
		System.out.println("세 수의 합 : " + result);
				
	}//end main
}// end class
