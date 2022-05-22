package com.callor.controller;

import com.callor.service.ScoreService_35;
import com.callor.service.impl.ScoreServiceImplV1_35;

public class ScoreControllerV1_35 {
//35 page
	public static void main(String[] args) {
		ScoreService_35 scService = new ScoreServiceImplV1_35();
		scService.inputScore();
	}
}
