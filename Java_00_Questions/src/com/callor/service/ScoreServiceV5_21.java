package com.callor.service;

import com.callor.utils.Line;

public class ScoreServiceV5_21 {

	int length = 60;
	
	int[] intKor = new int[10];
	public void makeScore() {
		for(int index = 0; index < intKor.length; index++ ) {
			intKor[index] = (int)(Math.random() * 100) + 1;
		}
	}//end makeScore
	public void printScore() {
		
		System.out.println(Line.dLine(length));
		System.out.println("햇살 고교 성적 일람표");
		System.out.println(Line.sLine(length));
		for(int i = 0; i < intKor.length; i ++) {
			System.out.printf("%d 번의 국어점수 : %d\n",i + 1,intKor[i]);
		}
		System.out.println(Line.sLine(length));
	
	}
	public void sumScore() {
		int intSum = 0;
		for(int i = 0; i < intKor.length; i ++) {
			intSum += intKor[i];
		}
		System.out.printf("국어점수의 총점은 : %d\n",intSum);
		System.out.printf("국어점수의 평균은 : %d\n", intSum / intKor.length);
		System.out.println(Line.dLine(length));
	}
	
	
}//end class
