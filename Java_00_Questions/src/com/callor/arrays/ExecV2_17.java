package com.callor.arrays;

public class ExecV2_17 {
// 17 page
	public static void main(String[] args) {
		
		int[] intNum = new int[100];
		for(int i = 0; i < intNum.length; i ++) {
			intNum[i] = (int)(Math.random() * 50 ) + 51;   // 1부터 100.99까지 수 만들어짐
		}// 배열에 랜덤값 넣기
		
		int count = 0;
		for(int i = 0; i < intNum.length; i ++) {
			if(intNum[i] % 2 == 0) {
				count++;
			}
		}
		System.out.printf("%d 개의 짝수가 있다.", count);

	}//end main
}//end class
