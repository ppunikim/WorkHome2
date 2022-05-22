package com.callor.app;

public class Exec_39 {
//39 page
	public static void main(String[] args) {
		
		int[] intNums = new int[100];
		for(int index = 0; index < intNums.length; index++) {
			intNums[index] = (int)(Math.random() * 100) + 1;
			System.out.printf("%d\t", intNums[index]);
		}//100개 배열에 랜덤값 넣기
		
		int intSum = 0;
		float fAvg = 0f;
		for(int i = 0 ; i < intNums.length; i ++) {
			intSum += intNums[i]; 		//배열에 저장된 정수들의 합
			fAvg = intSum / intNums.length;	//배열에 저장된 정수의 평균값
		}
		System.out.println();
		System.out.printf("배열에 저장된 정수의 합 : %d\n" , intSum);
		System.out.printf("배열에 저장된 정수의 평균값 : %3.1f" , fAvg);
		
		
		
	}//end main
}//end class
