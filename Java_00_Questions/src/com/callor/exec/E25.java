package com.callor.exec;

public class E25 {
	public static void main(String[] args) {

		int intNum = (int) (Math.random() * 100) + 1;
		boolean bYes = true;
		for (int index = 2; index < intNum; index++) {
			if (intNum % index == 0) {
				bYes = !bYes;	//false이다.
			} else {
				
			}
		} // end for
		
		System.out.printf("%d는 소수이다.\n", intNum);
	}// end main
}// end class
