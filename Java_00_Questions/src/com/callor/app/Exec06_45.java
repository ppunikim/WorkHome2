package com.callor.app;

public class Exec06_45 {
//45 page
	public static void main(String[] args) {
		
		int[] nums = new int[100];
		for(int i = 0; i < nums.length; i ++) {
			nums[i] = (int)(Math.random() * 100 ) + 1;
		}// 배열에 랜덤값 저장하기
		for(int j = 0; j < nums.length; j ++) {
			int index = 0;
			for(index = 2; index < nums.length; index ++) {
				if(nums[j] % index == 0) {
					break;
				} 
			}//end for(index)
			
			if(nums[j] <= index) {
				System.out.println(nums[j] + "는 소수");
			} else {
				System.out.println(nums[j] + "는 소수가 아니다.");
			}
			
		}//end for(j)
	}//end main
}//end class
