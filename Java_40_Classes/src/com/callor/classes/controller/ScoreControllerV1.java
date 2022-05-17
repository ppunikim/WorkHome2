package com.callor.classes.controller;

import com.callor.classes.service.ScoreServiceV1;

public class ScoreControllerV1 {
	public static void main(String[] args) {
		
		ScoreServiceV1 scV1 = new ScoreServiceV1(3);
		scV1.input();
		scV1.print();
		
	}//end main
}//end class
