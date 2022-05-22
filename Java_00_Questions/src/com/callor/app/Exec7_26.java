package com.callor.app;

public class Exec7_26 {
// 27 page
	public static void main(String[] args) {
		int[] intNums  = new int[100];
		for(int i = 0; i < intNums.length; i ++) {
			intNums[i] = (int)(Math.random() * 100)  + 2;  //2 ~ 101 수
		}//end for : 배열에 랜덤값 담기 
		
		//intNums.length : 0부터 배열의 개수(100개)까지
		// 만약 intNums[0]가 41이라는 수가 나왔으면 
		int count = 0;
		boolean bYes = true;
		for( int i = 2; i < intNums.length; i ++) {
			// i 는 2부터 99까지 나누는 것이다.
			// 41 % 100은 어짜피 0이므로 상관 없다.
			//하지만 본인 수도 나눌 수 있지 않은가?
			if(intNums[i] % i == 0 ) {
				bYes = !bYes;
			}
			if(bYes) {
				count++;
			}
			System.out.println(intNums[i]);
		}//end for
		System.out.println(" 소수의 갯수는 : " + count);
		
		
	}//end main
}//end class
