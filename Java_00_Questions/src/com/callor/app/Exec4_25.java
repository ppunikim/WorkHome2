package com.callor.app;

//25 page
public class Exec4_25 {
	public static void main(String[] args) {

		int intNum = (int) (Math.random() * 100) + 1;
		//if intNum = 41의 값이 나오면
		boolean pFlag = true;
		
		for (int i = 2; i < intNum; i++) {
			// 2부터 40까지의 수만 나눈다.
			if (intNum % i == 0) {
				pFlag = !pFlag;
				break;
			}
		}
			if (pFlag) {
				System.out.printf("%d는 소수이다.", intNum);
			} else {
				System.out.printf("%d는 소수가 아니다.", intNum);
			}
		

	}// end main
}// end class
