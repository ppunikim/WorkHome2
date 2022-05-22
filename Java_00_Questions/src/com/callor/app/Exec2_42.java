package com.callor.app;

public class Exec2_42 {
//42 page
	public static void main(String[] args) {
		
		int[] intNums = new int[10];
		for(int index = 0; index < intNums.length; index ++) {
			intNums[index] = (int)(Math.random() * 100) + 1;
		}// 배열에 랜덤값 넣기
		
		int intCount = 0;
		int intSum = 0;
		
		for(int index = 0; index < intNums.length; index++) {
			if(intNums[index] % 2 == 0) {
				intCount++;
				intSum += intNums[index];
				System.out.printf("%d\t", intNums[index]);
			}
		}//end for
		System.out.println();
		System.out.println("배열에 저장된 짝수 갯수 : " + intCount);
		System.out.println("배열에 저장된 짝수 합 : " + intSum);
		
		
	}//end main
}//end class
