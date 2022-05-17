package com.callor.classes.exec;

import java.util.Scanner;

public class String2IntV5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 > ");
		/* scan.nextInt() 메서드는 Enter신호를 다음의
		 * nextLine()에 전달하여 이후의 nextLine()에 문제를 일으킨다.
		 * 그러므로, nextLine()을 사용하자.
		 */
		String strNum = scan.nextLine();
		int intNum = 0;
		if(strNum.equals("")) {
			System.out.println("숫자만 입력해라 마~");
		} else {
			intNum = Integer.valueOf(strNum);
		}
		System.out.print("문자열 입력 > ");
		String strValue = scan.nextLine();
		
		System.out.println("입력된 정수 : " + intNum);
		System.out.println("입력된 문자열 : " + strValue);
		
	}//end main
}//end class
