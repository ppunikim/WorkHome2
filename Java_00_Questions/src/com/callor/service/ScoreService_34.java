package com.callor.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO_34;
import com.callor.utils.Line;

public class ScoreService_34 {
//34 page
	private List<ScoreVO_34> scList;

	public ScoreService_34() {
		scList = new ArrayList<ScoreVO_34>();
	}

	public void makeScore() {
		
		for (int i = 0; i < 20; i++) {
			
			int[] intTotal = new int[4];
			int I_Kor = 0;
			int I_Eng = 1;
			int I_Math = 2;
			int I_Sum = 3;
			
			ScoreVO_34 scVO = new ScoreVO_34();
			scVO.setStNum(i + 1);
			int intKor = (int) (Math.random() * 50) + 51;
			int intEng = (int) (Math.random() * 50) + 51;
			int intMath = (int) (Math.random() * 50) + 51;
			int intSum = intKor + intEng + intMath;
			float fAvg = intSum / 3;
			scVO.setIntKor(intKor);
			scVO.setIntEng(intEng);
			scVO.setIntMath(intMath);
			scVO.setIntSum(intSum);
			scVO.setFAvg(fAvg);
			scList.add(scVO);
			
			intTotal[I_Kor] += scVO.getIntKor();
			intTotal[I_Eng] += scVO.getIntEng();
			intTotal[I_Math] += scVO.getIntMath();
			intTotal[I_Sum] += scVO.getIntSum();
			System.out.printf("총점\t%d\t%d\t%d\t%d\n", intTotal[I_Kor],intTotal[I_Eng],
					intTotal[I_Math],intTotal[I_Sum]);
			
		} // end for
	}// end makeScore

	public void scorePrint() {
		int length = 50;
		System.out.println(Line.dLine(length));

		for (ScoreVO_34 scVO : scList) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%5.1f\n", scVO.getStNum(), scVO.getIntKor(), scVO.getIntEng(),
					scVO.getIntMath(), scVO.getIntSum(), scVO.getFAvg()

			);

//		for(int i = 0; i < scList.size(); i ++) {
//			System.out.printf("%d\t%d\t%d\t%d\n",i + 1, );
//		}
		
		}
		
		
		
	}// end scorePrint

	

}//end class
