package com.callor.app;

public class Exec1_37 {
//37 page
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			int intNum = (int) (Math.random() * 100) + 1;
			if (intNum % 2 == 0) {
				System.out.println(intNum + "는 짝수이다.");
			} else {
				System.out.println(intNum + "는 짝수가 아니다.");
			}
		}//end for

	}// end main
}// end class
