package com.callor.controller;

import com.callor.service.ScoreServiceV5_21;

public class ScoreControllerV5_21 {
//21 page
	public static void main(String[] args) {
		ScoreServiceV5_21 scV5 = new ScoreServiceV5_21();
		scV5.makeScore();
		scV5.printScore();
		scV5.sumScore();
		
		
	}//end main
}//end class
