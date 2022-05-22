package com.callor.app;

public class Exec1_27 {
//27 page
	public static void main(String[] args) {
		
		int[] intNum = new int[100];
		for(int index = 0; index < intNum.length; index ++) {
			intNum[index] = (int)(Math.random() * 100) + 1;
		}// end for : 배열에 랜덤값 넣기
		
		boolean bYes = true;
		int count = 0;
		for(int index = 0; index < intNum.length; index++ ) {
			if(intNum[index] < 55 ) {
				bYes = !bYes;
			} else {
				System.out.print(intNum[index] + "\t");
				count++;
			}
		}//end for
		System.out.println();
		System.out.printf("55 이상 총 갯수 : %d\n", count);
		
		
		
		
	}//end main
}//end class
