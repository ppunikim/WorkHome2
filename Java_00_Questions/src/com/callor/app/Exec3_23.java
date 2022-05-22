package com.callor.app;

public class Exec3_23 {
//23 page
	
	public static void intArray() {
		int[] intNum = new int[10];
		int intSumAll = 0;
		for(int i = 0; i < intNum.length; i ++) {
			intNum[i] = (int)(Math.random() * 100) + 1;
			intSumAll += intNum[i];
		}
		System.out.println(intSumAll);
	}
	
	
	public static void main(String[] args) {
		
		intArray();
		
		
	}//end main
}//end class
