package com.callor.controller;

import com.callor.service.ServiceV3;

//13page
public class ControllerV3 {
	public static void main(String[] args) {
		
		ServiceV3 sV3 = new ServiceV3();
		System.out.println("다섯 국어 점수의 합 : " + sV3.scoreKorSum());
		
	}//end main
}//end class
