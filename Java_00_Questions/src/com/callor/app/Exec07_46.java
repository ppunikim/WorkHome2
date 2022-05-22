package com.callor.app;

import com.callor.utils.Line;

public class Exec07_46 {
//46 page
	public static void main(String[] args) {
		
		int length = 30;
		int intNum = 7;
		System.out.println(Line.dLine(length));
		System.out.printf("%d 단 구구단\n",intNum);
		System.out.println(Line.sLine(length));
		for(int i = 0; i < 9; i ++) {
			System.out.printf("%d X %d = %2d\n", intNum, i + 1, intNum * (i + 1));
		}
		System.out.println(Line.dLine(length));
		
	}//end main
}//end class
