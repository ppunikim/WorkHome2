package com.callor.app;

public class Exec3_24 {
//24 page
// 아직 잘 모르겠다.
	public static void main(String[] args) {
		
		int intSum = 0;
		for(int i = 0; i < 10; i ++) {
			int intNum = (int)(Math.random() * 100) + 1;
			intSum += even(intNum);
		}// 임의의 정수 1개를 10번 초기화& 선언
		System.out.println("짝수의 합 : " + intSum);
		
	}//end main
	
	public static int even(int num) {
		if(num % 2 == 0) {
			return num;
		} else {
			return 0;
		}
	}//end even
	
	
	
	
}//end class
