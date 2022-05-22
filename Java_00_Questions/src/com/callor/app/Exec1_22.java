package com.callor.app;

public class Exec1_22 {
// 22 page
	public static void main(String[] args) {
		int[] intNum = new int[10];
		for(int index = 0; index < intNum.length; index++ ) {
			intNum[index] = (int)(Math.random() * 100) + 1;
			System.out.printf("%d번째 값 : %d\n" ,index + 1,  intNum[index]);
		} 
	}//end main
}//end class
