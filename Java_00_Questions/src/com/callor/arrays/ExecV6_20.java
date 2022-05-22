package com.callor.arrays;

public class ExecV6_20 {
//20 page  -> 다시 풀어보자
	public static void main(String[] args) {
		int[] intNums = new int[100];			// 배열을 100개 만들기
		int count = 0;							// 짝수의 갯수를 세는 것
		for(int i = 0 ; i  < intNums.length; i ++) {	
			intNums[i] = (int)(Math.random() * 100 ) + 1;
		}// 배열에 랜덤 값 넣기
		
		for(int index = 0; index < intNums.length; index ++) {
			if(intNums[index] % 2 == 0) {
				System.out.print(intNums[index] + "\t"); //짝수의 값을 출력
				count ++;								 // 짝수의 개수를 세는 것
				if(count % 5 == 0 ) {					 // 만약 짝수 개수가 5개가 되면
					System.out.println();				 // 줄바꿈을 한다.
				}
			}//end if 
		}//end for : 전체 값을 출력하는 것
		System.out.println("\n값 : " + count);
		/*
		 * 만약 count한 것도 for문으로 따로 쓰게 된다면
		 * 이라는 것을 하지 못한다.
		 */
		
	}//end main
}//end class
