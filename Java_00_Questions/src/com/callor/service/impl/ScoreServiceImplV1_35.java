package com.callor.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO_35;
import com.callor.service.ScoreService_35;

public class ScoreServiceImplV1_35 implements ScoreService_35{

	protected Scanner scan;
	protected List<ScoreVO_35> scList;
	
	public ScoreServiceImplV1_35() {
		scan = new Scanner(System.in);
		scList = new ArrayList<>();
	}
	
	@Override
	public void inputScore() {
		
		while(true) {
			System.out.print("학생 이름 입력(QUIT: 종료) >> ");
			String stName = scan.nextLine();
			if(stName.equals("QUIT")) {
				break;
			}
			System.out.print("국어점수 >> ");
			String stKor = scan.nextLine();
			Integer intKor = Integer.valueOf(stKor);
			
			System.out.print("영어점수 >> ");
			String stEng = scan.nextLine();
			Integer intEng = Integer.valueOf(stEng);
			
			System.out.print("수학점수 >> ");
			String stMath = scan.nextLine();
			Integer intMath = Integer.valueOf(stMath);
			
			ScoreVO_35 scVO = new ScoreVO_35();
			scVO.setIntKor(intKor);
			scVO.setIntEng(intEng);
			scVO.setIntMath(intMath);
			
			scList.add(scVO);
		}//end while
		
		System.out.println("입력이 중단되었습니다.");
		
		
	}//end inputScore()

	@Override
	public void saveScore() {
		
	}

}//end ScoreServiceImplV1
