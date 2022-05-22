package com.callor.arrays;

public class ExecV4_18 {
//18 page
	public static void main(String[] args) {
		
		int[] intNum = new int[100];
		for(int index = 0; index < intNum.length; index ++) {
			intNum[index] = (int)(Math.random() * 40) + 61;
		}
		
		int intAddAll = 0;
		for(int index = 0; index < intNum.length; index ++) {
			if(intNum[index] % 2 == 0) {
				intAddAll += intNum[index];
			}
		}
		System.out.printf("짝수를 모두 더한 수는 %d 이다.",intAddAll);
		
		
		
	}//end main
}//end class
