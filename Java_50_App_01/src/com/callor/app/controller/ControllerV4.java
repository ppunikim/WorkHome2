package com.callor.app.controller;

import com.callor.app.service.ServiceV4;

public class ControllerV4 {
	public static void main(String[] args) {
		
		int[] scorList = new int[10];
		ServiceV4 sV4 = new ServiceV4(scorList);
		sV4.makeScore();
		
		for(int score: scorList) {
			System.out.printf(", %d",score);
		}
		
		
	}//end main
}//end class
