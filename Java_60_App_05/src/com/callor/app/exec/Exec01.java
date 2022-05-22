package com.callor.app.exec;

public class Exec01 {
	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i ++) {
			nums[i] = (int)(Math.random() * 100) + 1;
		}//임의의 수가 채워진 상태
		for(int num : nums) {
			System.out.printf("%d\t", num);
		}//출력하는 코드
		
		for(int i = 0; i < nums.length; i ++ ) {
			for(int j = i + 1; j < nums.length; j ++ ) {
				if( nums[i] > nums[j]) {
					int _temp = nums[j];
					nums[j] = nums[i];
					nums[i] = _temp;
				}
			}
		}//end for
		System.out.println();
		for(int num : nums) {
			System.out.printf("%d\t", num);
		}
		
	}//end main
}//end class
