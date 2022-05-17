package com.callor.app.exec;

public class Exec02 {
	public static void main(String[] args) {
		
		int[] nums = new int[10];
		for(int i = 0 ; i < nums.length; i ++) {
			nums[i] = (int)(Math.random() * 100) + 1; 
		}// nums배열에 랜덤값 저장
		
		int count = 0; // 갯수를 샐 변수
		int sum = 0; // 모두 더할 변수
		
		for(int num : nums) {
			if(num % 2 == 0) {
				count++;
				sum += num;
				System.out.printf("%d\t" ,num);
			}
		}
		System.out.println();
		System.out.printf("짝수의 갯수는 %d이고 합계는 %d 이다.", count, sum);
		
		
		
	}//end main

}
