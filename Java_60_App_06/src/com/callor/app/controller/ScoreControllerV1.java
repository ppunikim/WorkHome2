package com.callor.app.controller;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV1;

public class ScoreControllerV1 {
	public static void main(String[] args) {
		
		ScoreService scService = new ScoreServiceImplV1();
		scService.makeScore();
		
		
		
	}//end main
}//end class
