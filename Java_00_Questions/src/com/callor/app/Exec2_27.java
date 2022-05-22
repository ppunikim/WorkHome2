package com.callor.app;

public class Exec2_27 {
//27 page 두 번째 방법
	public static void main(String[] args) {
		
		int[] intNum = new int[100];
		for(int index = 0; index < intNum.length; index++) {
			intNum[index] = (int)(Math.random() * 100) + 1; 
		}//end intNum 배열에 랜덤값 담기
		
		int count = 0;
		for(int nums : intNum) {
			if(nums >= 55) {
				System.out.printf("%d\t" , nums);
				count++;
			}
		}
		System.out.println();
		System.out.println("55 이상의 수는 : " + count);
		
		
		
	}//end main
}//end class
