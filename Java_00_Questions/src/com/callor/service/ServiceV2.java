package com.callor.service;

import com.callor.utils.Line;

// 11 페이지
public class ServiceV2 {

	 public void guguDan() {
		int length = 60; 
		int intDan = 3; 
		System.out.println(Line.dLine(length));
		System.out.printf("%d 단 구구단\n", intDan);
		System.out.println(Line.sLine(length));
		for(int i = 0; i < 9; i ++) {
			System.out.printf("%d x %d = %2d\n", intDan, (i + 1) , intDan * (i + 1));
		}
		System.out.println(Line.dLine(length));
	}//end guguDan

}//end class






