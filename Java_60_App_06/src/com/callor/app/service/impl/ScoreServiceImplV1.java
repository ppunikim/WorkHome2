package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService{
	
	protected final List<ScoreVO> scList;
	
	public ScoreServiceImplV1() {
		scList = new ArrayList<>();
	}//생성자에서 List 초기화
	
	@Override
	public void makeScore() {
		
		
		for(int i = 0 ; i < 10; i ++) {
			int intKor = (int)(Math.random() * 100 ) + 1;
			int intEng = (int)(Math.random() * 100 ) + 1;
			int intMath = (int)(Math.random() * 100 ) + 1;
			ScoreVO scVO = new ScoreVO();
			scVO.setIntKor(intKor);
			scVO.setIntEng(intEng);
			scVO.setIntMath(intMath);
			scList.add(scVO);
		}
		System.out.println(scList);
		
		
		
		
	}

	@Override
	public void printScore() {
		
	}

	@Override
	public void sumScore() {
		
	}

	@Override
	public void avgScore() {
		
	}

}//end class
