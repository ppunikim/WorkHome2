package com.callor.app;

public class Exec2_23 {
//23 page
	public static void main(String[] args) {
	
		int[] intNum = new int[10];
		int intSumAll = 0;
		for(int i = 0; i < intNum.length; i ++) {
			intNum[i] = (int)(Math.random() * 100) + 1;
		}//랜덤값 저장
		
		for(int i = 0; i < intNum.length; i ++) {
			intSumAll += intNum[i];
		}// 요소 값 합산
		
		System.out.println(intSumAll);
		
	}//end main
}//end class
